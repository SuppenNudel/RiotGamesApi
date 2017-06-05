package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.model.MapData;

public class MapsRequest extends AbstractRequest<MapData> {

	public MapsRequest() {
		super("/lol/static-data/v3/maps");
	}

	@Override
	protected Type getType() {
		return MapData.class;
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
