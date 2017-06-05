package de.rohmio.lol.api.model;

import java.util.List;
import java.util.Map;

public class Item {

	private Gold gold;
	private String plaintext;
	private Boolean hideFromAll;
	private Boolean inStore;
	private List<String> into;
	private Integer id;
	private InventoryDataStats stats;
	private String colloq;
	private Map<String, Boolean> maps;
	private Integer specialRecipe;
	private Image image;
	private String description;
	private List<String> tags;
	private Map<String, String> effect;
	private String group;
	private Boolean consumeOnFull;
	private String name;
	private Boolean consumed;
	private String sanitizedDescription;
	private Integer depth;
	private Integer stacks;

	public Gold getGold() {
		return gold;
	}
	public String getPlaintext() {
		return plaintext;
	}
	public Boolean getHideFromAll() {
		return hideFromAll;
	}
	public Boolean getInStore() {
		return inStore;
	}
	public List<String> getInto() {
		return into;
	}
	public Integer getId() {
		return id;
	}
	public InventoryDataStats getStats() {
		return stats;
	}
	public String getColloq() {
		return colloq;
	}
	public Map<String, Boolean> getMaps() {
		return maps;
	}
	public Integer getSpecialRecipe() {
		return specialRecipe;
	}
	public Image getImage() {
		return image;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getTags() {
		return tags;
	}
	public Map<String, String> getEffect() {
		return effect;
	}
	public String getGroup() {
		return group;
	}
	public Boolean getConsumeOnFull() {
		return consumeOnFull;
	}
	public String getName() {
		return name;
	}
	public Boolean getConsumed() {
		return consumed;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public Integer getDepth() {
		return depth;
	}
	public Integer getStacks() {
		return stacks;
	}

}
