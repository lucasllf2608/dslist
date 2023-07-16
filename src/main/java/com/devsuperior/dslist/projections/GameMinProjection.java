package com.devsuperior.dslist.projections;


// Os projection são interfaces que servem para pegar os atributos de consultas nativas

public interface GameMinProjection {

	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
