package de.rohmio.lol.api.model;

import java.util.Map;

public class ProfileIconData {

	private Map<String, ProfileIconDetails> data;
	private String version;
	private String type;

	public Map<String, ProfileIconDetails> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}

}
