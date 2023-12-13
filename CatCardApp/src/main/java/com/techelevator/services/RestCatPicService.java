package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Component
public class RestCatPicService implements CatPicService {
	private final RestTemplate restTemplate = new RestTemplate();
	private final String BASE_URL = "https://cat-data.netlify.app/api/pictures/random";

	@Override
	public CatPic getPic() {
		// TODO Auto-generated method stub
		CatPic catPic = null;
		try {
			catPic = restTemplate.getForObject(BASE_URL, CatPic.class);
			return catPic;
		}catch (HttpServerErrorException | HttpClientErrorException e){
			throw new RuntimeException("Error retrieving cat pic", e);
		}
	}

}	
