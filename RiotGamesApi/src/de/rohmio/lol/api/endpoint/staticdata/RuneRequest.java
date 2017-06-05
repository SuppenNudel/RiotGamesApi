package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.RuneData;
import de.rohmio.lol.api.model.Rune;

public class RuneRequest extends AbstractRequest<Rune> {

	public RuneRequest(int id) {
		super("/lol/static-data/v3/runes/"+id);
	}

	@Override
	protected Type getType() {
		return Rune.class;
	}

	public void addRuneData(RuneData runeData) {
		addParameter("runeData", runeData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
