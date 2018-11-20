package com.gamonsoft.reactapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.result.view.Rendering;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.gamonsoft.reactapp.service.ReactiveResultRepository;

@Controller
public class ReactResultController {
	
  @Autowired
  ReactiveResultRepository reactiveResultRepository;

  @GetMapping("/results")
  public Rendering results(@RequestParam(value="page",required = false) Integer page, @RequestParam(value="size",required = false) Integer size) {
	
	//FIXME Remove this hard coded value. 
	String query = "";
	
	if(page == null || page==0) {
		page = 1;
	}
	
	if(size == null) {
		//FIXME move to application.properties
		size = 10;
	}
	  
    return Rendering.view("index")
    				.modelAttribute("page", page)
                    .modelAttribute("messages", new ReactiveDataDriverContextVariable(
                    		reactiveResultRepository.findPaginated(page,size,query)
                        ))
                    .build();
  }
}

/*

return Rendering.view("index")
.modelAttribute("message", new Message("Hello, this is a static message."))
.modelAttribute("messages", new ReactiveDataDriverContextVariable(
        Flux.zip(
            Flux.interval(Duration.ofSeconds(1)),
            reactiveResultRepository.findAll2().delayElements(Duration.ofSeconds(1))
    )))
.build();
*/