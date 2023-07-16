package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescriprion;
	
	
	public GameMinDTO () {
		
	}


	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescriprion = entity.getShortDescription();
	}
	

	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescriprion = projection.getShortDescription();
	}
	
	
	
	
	
	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Integer getYeaer() {
		return year;
	}
	
	public String getImgUrl () {
		return imgUrl;
	}
	
	public String getShortDescriprion() {
		return shortDescriprion;
	}
	
}
