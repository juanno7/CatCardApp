package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://cat-data.netlify.app/api/facts/random";
	@Override
	public CatFact getFact() {
		// TODO Auto-generated method stub
		CatFact catFact = null;
		try {
			catFact = restTemplate.getForObject(BASE_URL, CatFact.class);
			return catFact;
		}catch (HttpServerErrorException | HttpClientErrorException e){
			throw new RuntimeException("Error retrieving cat fact", e);
		}
	}

}
