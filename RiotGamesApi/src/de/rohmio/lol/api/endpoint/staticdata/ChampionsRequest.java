package de.rohmio.lol.api.endpoint.staticdata;

import java.util.Locale;

import org.apache.http.client.utils.URIBuilder;

import de.rohmio.lol.api.endpoint.constant.ChampionData;
import de.rohmio.lol.api.endpoint.constant.Region;
import de.rohmio.lol.api.model.ChampionList;
import de.rohmio.lol.api.util.Config;
import de.rohmio.lol.api.util.RestRequestor;

public class ChampionsRequest {

	private URIBuilder builder;

	public ChampionsRequest() {
		builder = new URIBuilder()
				.setScheme("https")
				.setHost("euw1.api.riotgames.com")
				.setPath("/lol/static-data/v3/champions")
				.setParameter("api_key", Config.getInstance().getApiKey());
	}

	public ChampionList execute() throws Exception {
		return RestRequestor.restRequestGet(builder.build(), ChampionList.class);
	}

	public ChampionsRequest addChampionData(ChampionData championData) {
		builder.addParameter("champData", championData.name());
		return this;
	}

	public ChampionsRequest setVersion(String version) {
		builder.addParameter("version", version);
		return this;
	}

	public ChampionsRequest setDataById(boolean dataById) {
		builder.addParameter("dataById", String.valueOf(dataById));
		return this;
	}

	public ChampionsRequest setLocale(Locale locale) {
		builder.addParameter("locale", locale.toString());
		return this;
	}

	public ChampionsRequest setRegion(Region region) {
		builder.setHost(String.format("%s.api.riotgames.com", region.name()));
		return this;
	}

}
