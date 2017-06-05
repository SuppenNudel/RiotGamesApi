package de.rohmio.lol.api.model;

import java.util.Map;

public class SummonerSpellList {

	private Map<String, SummonerSpell> data;
	private String version;
	private String type;

	public Map<String, SummonerSpell> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}

}
