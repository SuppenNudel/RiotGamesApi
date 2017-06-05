package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;

import de.rohmio.lol.api.model.Realm;

public class RealmRequest extends AbstractRequest<Realm> {

	public RealmRequest() {
		super("/lol/static-data/v3/realms");
	}

	@Override
	protected Type getType() {
		return Realm.class;
	}

}
