package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.MasteryListData;
import de.rohmio.lol.api.model.MasteryList;

public class MasteryListRequest extends AbstractRequest<MasteryList> {

	public MasteryListRequest() {
		super("/lol/static-data/v3/masteries");
	}

	@Override
	protected Type getType() {
		return MasteryList.class;
	}

	public void addMasteryListData(MasteryListData masteryListData) {
		addParameter("masteryListData", masteryListData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
