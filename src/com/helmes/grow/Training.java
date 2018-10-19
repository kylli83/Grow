package com.helmes.grow;

import java.util.Date;
import java.util.List;

public class Training {
	private Long id;
	private String name;
	private String description;
	private Date date;
	private List<String> relatedJobTitles;

	public Training() {

	}
	public Training(Long id, String name, String description, Date date, List<String> relatedJobTitles) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.relatedJobTitles = relatedJobTitles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getRelatedJobTitles() {
		return relatedJobTitles;
	}

	public void setRelatedJobTitles(List<String> relatedJobTitles) {
		this.relatedJobTitles = relatedJobTitles;
	}
}
