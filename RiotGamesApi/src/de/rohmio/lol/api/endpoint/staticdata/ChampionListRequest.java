package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.ChampListData;
import de.rohmio.lol.api.endpoint.constant.Tag;
import de.rohmio.lol.api.model.ChampionList;

public class ChampionListRequest extends AbstractRequest<ChampionList> {

	public ChampionListRequest() {
		super("/lol/static-data/v3/champions");
	}

	@Override
	protected Type getType() {
		return ChampionList.class;
	}

	public void addChampListData(ChampListData champListData) {
		addParameter("champListData", champListData.name());
	}

	public void addTag(Tag tag) {
		addParameter("tags", tag.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setDataById(boolean dataById) {
		setParameter("dataById", String.valueOf(dataById));
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
