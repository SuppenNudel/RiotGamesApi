package de.rohmio.lol.api.model;

import java.util.List;

/**
 * This object contains champion spell data.
 * @author Cedric
 *
 */
public class ChampionSpell {

	private String cooldownBurn;
	private String resource;
	private LevelTip leveltip;
	private List<SpellVars> vars;
	private String costType;
	private Image image;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private List<Object> effect; // this field is a List of List of Double
	private String tooltip;
	private Integer maxrank;
	private String costBurn;
	private String rangeBurn;
	private Object range; // This field is either a List of Integer or the String 'self' for spells that target one's own champion.
	private List<Double> cooldown;
	private List<Integer> cost;
	private String key;
	private String description;
	private List<String> effectBurn;
	private List<Image> altimages;
	private String name;

	public String getCooldownBurn() {
		return cooldownBurn;
	}
	public String getResource() {
		return resource;
	}
	public LevelTip getLeveltip() {
		return leveltip;
	}
	public List<SpellVars> getVars() {
		return vars;
	}
	public String getCostType() {
		return costType;
	}
	public Image getImage() {
		return image;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}
	public List<Object> getEffect() {
		return effect;
	}
	public String getTooltip() {
		return tooltip;
	}
	public Integer getMaxrank() {
		return maxrank;
	}
	public String getCostBurn() {
		return costBurn;
	}
	public String getRangeBurn() {
		return rangeBurn;
	}
	public Object getRange() {
		return range;
	}
	public List<Double> getCooldown() {
		return cooldown;
	}
	public List<Integer> getCost() {
		return cost;
	}
	public String getKey() {
		return key;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getEffectBurn() {
		return effectBurn;
	}
	public List<Image> getAltimages() {
		return altimages;
	}
	public String getName() {
		return name;
	}

}
