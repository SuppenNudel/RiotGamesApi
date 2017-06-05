package de.rohmio.lol.api.model;

import java.util.List;

public class Rune {

	private RuneStats stats;
	private String name;
	private List<String> tags;
	private Image image;
	private String sanitizedDescription;
	private MetaData rune;
	private Integer id;
	private String description;

	public RuneStats getStats() {
		return stats;
	}
	public String getName() {
		return name;
	}
	public List<String> getTags() {
		return tags;
	}
	public Image getImage() {
		return image;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public MetaData getRune() {
		return rune;
	}
	public Integer getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}

}
