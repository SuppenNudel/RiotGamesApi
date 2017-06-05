package de.rohmio.lol.api.util;

import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;

public class RestRequestor {

	private static Gson gson = new Gson();

	public static <T> T restRequestGet(URI uri, Class<T> clazz) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpResponse response = httpClient.execute(httpget);

		System.out.println(response.getStatusLine().toString()+" - "+uri);
		HttpEntity entity = response.getEntity();
		InputStreamReader reader = new InputStreamReader(entity.getContent());
		T fromJson = RestRequestor.gson.fromJson(reader, clazz);

		response.close();
		return fromJson;
	}

}
