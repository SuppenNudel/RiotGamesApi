package de.rohm.lol.api;

import org.junit.Assert;
import org.junit.Test;

import de.rohmio.lol.api.util.Config;

public class FileReaderTest {

	private String apiKey;

	@Test
	public void readConfig() {
		apiKey = Config.getInstance().getApiKey();
		Assert.assertNotNull(apiKey);
		Assert.assertTrue(apiKey.startsWith("RGAPI-"));
	}

}
