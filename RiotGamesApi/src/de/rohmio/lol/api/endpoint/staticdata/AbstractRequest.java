package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;

import org.apache.http.client.utils.URIBuilder;

import de.rohmio.lol.api.endpoint.constant.Region;
import de.rohmio.lol.api.util.Config;
import de.rohmio.lol.api.util.RestRequestor;

public abstract class AbstractRequest<T> {

	private URIBuilder builder;

	public AbstractRequest(String path) {
		builder = new URIBuilder()
				.setScheme("https")
				.setHost(Config.getInstance().getDefaultRegion()+".api.riotgames.com")
				.setPath(path)
				.setParameter("api_key", Config.getInstance().getApiKey());
	}

	protected abstract Type getType();

	public T execute() throws Exception {
		return RestRequestor.restRequestGet(builder.build(), getType());
	}

	protected AbstractRequest<T> addParameter(String param, String value) {
		builder.addParameter(param, value);
		return this;
	}

	protected AbstractRequest<T> setParameter(String param, String value) {
		builder.setParameter(param, value);
		return this;
	}

	public AbstractRequest<T> setHost(Region region) {
		builder.setHost(String.format("%s.api.riotgames.com", region.name()));
		return this;
	}

}
