package de.rohmio.lol.api.model;

import java.util.Map;

public class MasteryList {

	private Map<String, Mastery> data;
	private String version;
	private MasteryTree tree;
	private String type;

	public Map<String, Mastery> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public MasteryTree getTree() {
		return tree;
	}
	public String getType() {
		return type;
	}

}
