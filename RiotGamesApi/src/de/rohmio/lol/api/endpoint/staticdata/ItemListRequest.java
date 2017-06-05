package de.rohmio.lol.api.endpoint.staticdata;

import java.lang.reflect.Type;
import java.util.Locale;

import de.rohmio.lol.api.endpoint.constant.ItemListData;
import de.rohmio.lol.api.model.ItemList;

public class ItemListRequest extends AbstractRequest<ItemList> {

	public ItemListRequest() {
		super("/lol/static-data/v3/items");
	}

	@Override
	protected Type getType() {
		return ItemList.class;
	}

	public void addItemListData(ItemListData itemListData) {
		addParameter("itemListData", itemListData.name());
	}

	public void setVersion(String version) {
		setParameter("version", version);
	}

	public void setLocale(Locale locale) {
		setParameter("locale", locale.toString());
	}

}
