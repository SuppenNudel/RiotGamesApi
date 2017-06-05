package de.rohmio.lol.api.model;

import java.util.List;

public class SummonerSpell {

	private List<SpellVars> vars;
	private Image image;
	private String costBurn;
	private List<Double> cooldown;
	private List<String> effectBurn;
	private Integer id;
	private String cooldownBurn;
	private String tooltip;
	private Integer maxrank;
	private String rangeBurn;
	private String description;
	private List<Object> effect; // This field is a List of List of Double.
	private String key;
	private LevelTip leveltip;
	private List<String> modes;
	private String resoure;
	private String name;
	private String costType;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private Object range; // This field is either a List of Integer or the String 'self' for spells that target one's own champion.
	private List<Integer> cost;
	private Integer summonerLevel;

	public List<SpellVars> getVars() {
		return vars;
	}
	public Image getImage() {
		return image;
	}
	public String getCostBurn() {
		return costBurn;
	}
	public List<Double> getCooldown() {
		return cooldown;
	}
	public List<String> getEffectBurn() {
		return effectBurn;
	}
	public Integer getId() {
		return id;
	}
	public String getCooldownBurn() {
		return cooldownBurn;
	}
	public String getTooltip() {
		return tooltip;
	}
	public Integer getMaxrank() {
		return maxrank;
	}
	public String getRangeBurn() {
		return rangeBurn;
	}
	public String getDescription() {
		return description;
	}
	public List<Object> getEffect() {
		return effect;
	}
	public String getKey() {
		return key;
	}
	public LevelTip getLeveltip() {
		return leveltip;
	}
	public List<String> getModes() {
		return modes;
	}
	public String getResoure() {
		return resoure;
	}
	public String getName() {
		return name;
	}
	public String getCostType() {
		return costType;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}
	public Object getRange() {
		return range;
	}
	public List<Integer> getCost() {
		return cost;
	}
	public Integer getSummonerLevel() {
		return summonerLevel;
	}

}
