package com.techprimers.jaegerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jaegerserver.service.jaegerServerService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jaeger/server")
public class JaegerServerController {

	private jaegerServerService jaegerServiceService;

	public JaegerServerController(jaegerServerService jaegerServiceService) {
		this.jaegerServiceService = jaegerServiceService;
	}

	@GetMapping("/{id}")
	public Mono<String> get(@PathVariable("id") int id) {
		return jaegerServiceService.get(id);
	}
}
