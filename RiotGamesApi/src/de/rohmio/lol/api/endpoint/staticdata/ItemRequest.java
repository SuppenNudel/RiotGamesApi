package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.ItemData;
import de.rohmio.lol.api.model.Item;

public class ItemRequest extends AbstractRequest<Item> {

	public ItemRequest(int id) {
		super("/lol/static-data/v3/items/"+id);
	}

	@Override
	protected Type getType() {
		return Item.class;
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void addItemData(ItemData itemData) {
		addParameter("itemData", itemData.name());
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
