package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

public class LanguagesRequest extends AbstractRequest<List<String>> {

	public LanguagesRequest() {
		super("/lol/static-data/v3/languages");
	}

	@Override
	protected Type getType() {
		return new TypeToken<List<String>>(){}.getType();
	}

}
