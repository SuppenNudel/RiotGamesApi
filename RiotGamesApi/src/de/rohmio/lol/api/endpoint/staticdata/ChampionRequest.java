package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.ChampData;
import de.rohmio.lol.api.endpoint.constant.Tag;
import de.rohmio.lol.api.model.Champion;

public class ChampionRequest extends AbstractRequest<Champion> {

	public ChampionRequest(int id) {
		super("/lol/static-data/v3/champions/"+id);
	}

	@Override
	protected Type getType() {
		return Champion.class;
	}

	public void addChampData(ChampData champData) {
		addParameter("champData", champData.name());
	}

	public void addTag(Tag tag) {
		addParameter("tags", tag.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
