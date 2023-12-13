package com.techelevator.model;

import javax.validation.constraints.NotEmpty;

public class CatCard {

	private int catCardId;
	@NotEmpty(message = "cat fact must not be blank")
	private String catFact;
	@NotEmpty(message = "imgUrl must not be blank")
	private String imgUrl;
	@NotEmpty(message = "caption must not be blank")
	private String caption;

	public int getCatCardId() {
		return catCardId;
	}
	public void setCatCardId(int catCardId) {
		this.catCardId = catCardId;
	}
	
	public String getCatFact() {
		return catFact;
	}
	public void setCatFact(String catFact) {
		this.catFact = catFact;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
}
