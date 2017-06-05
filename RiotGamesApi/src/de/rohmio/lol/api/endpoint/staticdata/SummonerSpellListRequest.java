package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.SpellListData;
import de.rohmio.lol.api.model.SummonerSpellList;

public class SummonerSpellListRequest extends AbstractRequest<SummonerSpellList> {

	public SummonerSpellListRequest() {
		super("/lol/static-data/v3/summoner-spells");
	}

	@Override
	protected Type getType() {
		return SummonerSpellList.class;
	}

	public void addSpellListData(SpellListData spellListData) {
		addParameter("spellListData", spellListData.name());
	}

	public void setDataById(boolean dataById) {
		setParameter("dataById", String.valueOf(dataById));
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
