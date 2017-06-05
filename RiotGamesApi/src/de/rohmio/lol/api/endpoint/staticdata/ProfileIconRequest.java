package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.model.ProfileIconData;

public class ProfileIconRequest extends AbstractRequest<ProfileIconData> {

	public ProfileIconRequest() {
		super("/lol/static-data/v3/profile-icons");
	}

	@Override
	protected Type getType() {
		return ProfileIconData.class;
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
