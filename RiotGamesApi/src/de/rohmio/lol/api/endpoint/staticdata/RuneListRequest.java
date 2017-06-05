package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.RuneListData;
import de.rohmio.lol.api.model.RuneList;

public class RuneListRequest extends AbstractRequest<RuneList> {

	public RuneListRequest() {
		super("/lol/static-data/v3/runes");
	}

	@Override
	protected Type getType() {
		return RuneList.class;
	}

	public void addRuneListData(RuneListData runeListData) {
		addParameter("runeListData", runeListData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
