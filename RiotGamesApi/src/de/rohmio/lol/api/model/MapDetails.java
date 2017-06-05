package de.rohmio.lol.api.model;

import java.util.List;

public class MapDetails {

	private String mapName;
	private Image image;
	private Long mapId;
	private List<Long> unpurchasableItemList;

	public String getMapName() {
		return mapName;
	}
	public Image getImage() {
		return image;
	}
	public Long getMapId() {
		return mapId;
	}
	public List<Long> getUnpurchasableItemList() {
		return unpurchasableItemList;
	}

}
