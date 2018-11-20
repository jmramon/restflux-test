package com.gamonsoft.restflux;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;

import com.gamonsoft.restflux.model.ResultN3;

import reactor.core.publisher.Flux;

@RunWith(SpringRunner.class)
//  We create a `@SpringBootTest`, starting an actual server on a `RANDOM_PORT`
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReactAppTest {

	@Test
	public void testHelloOpenData() {
		WebClient webClient = WebClient.create("http://opendata-ajuntament.barcelona.cat/data/api/3/action");

		Flux<ResultN3> resultsN3 = webClient.get().uri(uriBuilder -> uriBuilder.path("/package_search")
		        .queryParam("q", "Padro")
		        .queryParam("rows", "1")
		        .queryParam("start", "2")
		        .build()).
		    accept(MediaType.APPLICATION_JSON_UTF8).
		    exchange().
		    flatMapMany(response -> response.bodyToFlux(ResultN3.class));
		
		List<ResultN3> list1 = resultsN3.collectList().block();	
		
		list1.forEach(System.out::println);
		
	}
}


