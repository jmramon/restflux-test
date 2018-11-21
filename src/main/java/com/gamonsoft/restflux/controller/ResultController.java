package com.gamonsoft.restflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.result.view.Rendering;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.gamonsoft.restflux.service.ResultRepository;

@Controller
public class ResultController {
	
  @Autowired
  ResultRepository reactiveResultRepository;
  
  @GetMapping("/")
  public Rendering index() {
	  return Rendering.view("index").build();
  }
  
  @GetMapping("/results")
  public Rendering results(@RequestParam(value="page",required = false) Integer page, @RequestParam(value="size",required = false) Integer size) {
	
	//FIXME Remove this hard coded value. 
	String query = "";
	
	if(page == null || page==0) {
		page = 1;
	}
	
	if(size == null) {
		//FIXME move to application.properties
		size = 5;
	}
	  
    return Rendering.view("results")
    				.modelAttribute("page", page)
                    .modelAttribute("messages", new ReactiveDataDriverContextVariable(
                    		reactiveResultRepository.findPaginated(page,size,query)
                        ))
                    .build();
  }
}