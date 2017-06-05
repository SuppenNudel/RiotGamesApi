package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.MasteryData;
import de.rohmio.lol.api.model.Mastery;

public class MasteryRequest extends AbstractRequest<Mastery> {

	public MasteryRequest(int id) {
		super("/lol/static-data/v3/masteries/"+id);
	}

	@Override
	protected Type getType() {
		return Mastery.class;
	}

	public void addMasteryData(MasteryData masteryData) {
		addParameter("masteryData", masteryData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
