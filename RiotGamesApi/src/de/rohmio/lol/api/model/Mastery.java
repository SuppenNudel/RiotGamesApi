package de.rohmio.lol.api.model;

import java.util.List;

public class Mastery {

	private String prereq;
	private MasteryTree masteryTree;
	private String name;
	private Integer ranks;
	private Image image;
	private List<String> sanitizedDescription;
	private Integer id;
	private List<String> description;

	public String getPrereq() {
		return prereq;
	}
	public MasteryTree getMasteryTree() {
		return masteryTree;
	}
	public String getName() {
		return name;
	}
	public Integer getRanks() {
		return ranks;
	}
	public Image getImage() {
		return image;
	}
	public List<String> getSanitizedDescription() {
		return sanitizedDescription;
	}
	public Integer getId() {
		return id;
	}
	public List<String> getDescription() {
		return description;
	}

}
