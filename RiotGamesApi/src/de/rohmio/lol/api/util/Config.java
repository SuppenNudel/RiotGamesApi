package de.rohmio.lol.api.util;

import java.util.ResourceBundle;

public class Config {

	private ResourceBundle config;

	private static Config instance;
	private Config() {
		config = ResourceBundle.getBundle("config");
	}
	public static Config getInstance() {
		if(Config.instance == null) {
			Config.instance = new Config();
		}
		return Config.instance;
	}

	public String getApiKey() {
		return config.getString("api-key");
	}
	public String getDefaultRegion() {
		return config.getString("region");
	}

}
