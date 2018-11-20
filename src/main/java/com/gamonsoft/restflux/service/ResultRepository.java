package com.gamonsoft.restflux.service;

import java.time.Duration;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.gamonsoft.restflux.model.ResultN0;
import com.gamonsoft.restflux.model.ResultN3;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ResultRepository {
	
	public Flux<ResultN0> findPaginated(int page,int size,String query){
		
		WebClient webClient = WebClient.create("http://opendata-ajuntament.barcelona.cat/data/api/3/action");

		
		Mono<ResultN3> resultN3Mono = webClient.get().uri(uriBuilder -> uriBuilder.path("/package_search")
		        //.queryParam("q", query)
		        .queryParam("rows", size)
		        .queryParam("start", page*size)
		        .build()).
		    accept(MediaType.APPLICATION_JSON_UTF8).retrieve().bodyToMono(ResultN3.class);
		
		Mono<List<ResultN0>> resultN3List = resultN3Mono.map(info -> info.getResult().getResults());
		
		Flux<ResultN0> resultsN0 = resultN3List.flatMapMany(Flux::fromIterable);
		
		//resultsN0.delaySequence(Duration.ofSeconds(10));
		
		return resultsN0;
	}
}
