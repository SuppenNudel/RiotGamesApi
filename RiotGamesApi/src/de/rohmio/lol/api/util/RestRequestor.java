package de.rohmio.lol.api.util;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;

public class RestRequestor {

	private static Gson gson = new Gson();

	public static <T> T restRequestGet(URI uri, Type type) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(uri);
		CloseableHttpResponse response = httpClient.execute(httpget);

		StatusLine statusLine = response.getStatusLine();
		System.out.println(statusLine.toString()+" - "+uri);
		RestRequestor.statusLine(statusLine);

		HttpEntity entity = response.getEntity();
		InputStreamReader reader = new InputStreamReader(entity.getContent());
		switch(statusLine.getStatusCode()) {
		case 200:
			T fromJson = RestRequestor.gson.fromJson(reader, type);
			response.close();
			return fromJson;
		default:
			RestRequestor.statusLine(statusLine);
			RequestException requestError = RestRequestor.gson.fromJson(reader, RequestException.class);
			response.close();
			throw requestError;
		}
	}

	private static void statusLine(StatusLine statusLine) {
		switch (statusLine.getStatusCode()) {
		case 400:
			System.out.println("Bad request");
			break;
		default:
			break;
		}
	}

}
