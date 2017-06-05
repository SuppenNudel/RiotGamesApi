package de.rohm.lol.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.rohmio.lol.api.endpoint.staticdata.ChampionsRequest;
import de.rohmio.lol.api.model.Champion;
import de.rohmio.lol.api.model.ChampionList;
import de.rohmio.lol.api.util.Config;

public class RestRequestorTest {

	private String apiKey;

	@Before
	public void readConfig() {
		apiKey = Config.getInstance().getApiKey();
		Assert.assertNotNull(apiKey);
		Assert.assertTrue(apiKey.startsWith("RGAPI-"));
	}

	@Test
	public void requestTest() throws Exception {
		ChampionList champions = new ChampionsRequest().execute();
		Assert.assertNotNull(champions);
		Champion champion = champions.getData("Nasus");
		Assert.assertNotNull(champion);
	}

}
