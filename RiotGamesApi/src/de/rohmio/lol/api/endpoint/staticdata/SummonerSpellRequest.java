package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.SpellData;
import de.rohmio.lol.api.model.SummonerSpell;

public class SummonerSpellRequest extends AbstractRequest<SummonerSpell> {

	public SummonerSpellRequest(int id) {
		super("/lol/static-data/v3/summoner-spells/"+id);
	}

	@Override
	protected Type getType() {
		return SummonerSpell.class;
	}

	public void addSpellData(SpellData spellData) {
		addParameter("spellData", spellData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
