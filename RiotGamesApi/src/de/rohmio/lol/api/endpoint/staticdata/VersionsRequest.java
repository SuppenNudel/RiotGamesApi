package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

public class VersionsRequest extends AbstractRequest<List<String>> {

	public VersionsRequest() {
		super("/lol/static-data/v3/versions");
	}

	@Override
	protected Type getType() {
		return new TypeToken<List<String>>(){}.getType();
	}

}
