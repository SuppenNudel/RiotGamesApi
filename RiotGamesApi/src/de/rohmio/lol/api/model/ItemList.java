package de.rohmio.lol.api.model;

import java.util.List;
import java.util.Map;

/**
 * This object contains item list data.
 * @author Cedric
 *
 */
public class ItemList {

	private Map<String, Item> data;
	private String version;
	private List<ItemTree> tree;
	private List<Group> groups;
	private String type;

	public Map<String, Item> getData() {
		return data;
	}
	public String getVersion() {
		return version;
	}
	public List<ItemTree> getTree() {
		return tree;
	}
	public List<Group> getGroups() {
		return groups;
	}
	public String getType() {
		return type;
	}

}
