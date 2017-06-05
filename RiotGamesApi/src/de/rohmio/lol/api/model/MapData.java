package de.rohmio.lol.api.model;

import java.util.Map;

public class MapData {

	private Map<String, MapDetails> data;
	private String version;
	private String type;

	public Map<String, MapDetails> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}

}
