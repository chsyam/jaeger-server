package com.techprimers.jaegerserver.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class jaegerServerService {

	private WebClient webClient;

	public jaegerServerService(WebClient webClient) {
		this.webClient = webClient;
	}

	public Mono<String> get(Integer id) {

		return webClient.get().uri("http://numbersapi.com/" + id).retrieve().bodyToMono(String.class);

	}
}
