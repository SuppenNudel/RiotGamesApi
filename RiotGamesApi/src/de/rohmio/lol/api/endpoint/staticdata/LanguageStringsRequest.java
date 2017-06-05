package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.model.LanguageStrings;

public class LanguageStringsRequest extends AbstractRequest<LanguageStrings> {

	public LanguageStringsRequest() {
		super("/lol/static-data/v3/language-strings");
	}

	@Override
	protected Type getType() {
		return LanguageStrings.class;
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
