package de.rohmio.lol.api.model;

import java.util.Map;

public class RuneList {

	private Map<String, Rune> data;
	private String version;
	private String type;

	public Map<String, Rune> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}

}
