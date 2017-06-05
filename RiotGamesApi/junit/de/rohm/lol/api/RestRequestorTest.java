package de.rohm.lol.api;

import java.net.URI;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.rohmio.lol.api.endpoint.staticdata.ChampionListRequest;
import de.rohmio.lol.api.model.Champion;
import de.rohmio.lol.api.model.ChampionList;
import de.rohmio.lol.api.util.Config;
import de.rohmio.lol.api.util.RequestException;
import de.rohmio.lol.api.util.RestRequestor;

public class RestRequestorTest {

	private String apiKey;

	@Before
	public void readConfig() {
		apiKey = Config.getInstance().getApiKey();
		Assert.assertNotNull(apiKey);
		Assert.assertTrue(apiKey.startsWith("RGAPI-"));
	}

	@Test(expected=RequestException.class)
	public void unexistingPathTest() throws Exception {
		String url = String.format("https://euw1.api.riotgames.com/lol/static-data/v3?api_key=", apiKey);
		try {
			RestRequestor.restRequestGet(URI.create(url), ChampionList.class);
		} catch (RequestException e) {
			Assert.assertEquals(401, e.getStatus().getStatus_code());
			Assert.assertEquals("Unauthorized", e.getStatus().getMessage());
			throw e;
		}
	}

	@Test(expected=RequestException.class)
	public void noApiKeyTest() throws Exception {
		String url = "https://euw1.api.riotgames.com/lol/static-data/v3/chapions";
		try {
			RestRequestor.restRequestGet(URI.create(url), ChampionList.class);
		} catch (RequestException e) {
			Assert.assertEquals(401, e.getStatus().getStatus_code());
			Assert.assertEquals("Unauthorized", e.getStatus().getMessage());
			throw e;
		}
	}

	@Test(expected=RequestException.class)
	public void invalidApiKeyTest() throws Exception {
		String url = String.format("https://euw1.api.riotgames.com/lol/static-data/v3/champions?api_key=", "abcdefg");
		try {
			RestRequestor.restRequestGet(URI.create(url), ChampionList.class);
		} catch (RequestException e) {
			Assert.assertEquals(401, e.getStatus().getStatus_code());
			Assert.assertEquals("Unauthorized", e.getStatus().getMessage());
			throw e;
		}
	}


	@Test
	public void championRequestTest() throws Exception {
		ChampionList championList = new ChampionListRequest().execute();
		Assert.assertNotNull(championList);
		Champion champion = championList.getData("Nasus");
		Assert.assertNotNull(champion);
	}

}
