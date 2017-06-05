package de.rohmio.lol.api.model;

import java.util.List;

import com.sun.org.glassfish.external.statistics.Stats;

/**
 * This object contains champion data.
 * @author Cedric
 *
 */
public class Champion {

	private Info info;
	private List<String> enemytips;
	private Stats stats;
	private String name;
	private String title;
	private Image image;
	private List<String> tags;
	private String partype;
	private List<Skin> skins;
	private Passive passive;
	private List<Recommended> recommended;
	private List<String> allytips;
	private String key;
	private String lore;
	private Integer id;
	private String blurb;
	private List<ChampionSpell> spells;

	public Info getInfo() {
		return info;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public Stats getStats() {
		return stats;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public Image getImage() {
		return image;
	}
	public List<String> getTags() {
		return tags;
	}
	public String getPartype() {
		return partype;
	}
	public List<Skin> getSkins() {
		return skins;
	}
	public Passive getPassive() {
		return passive;
	}
	public List<Recommended> getRecommended() {
		return recommended;
	}
	public List<String> getAllytips() {
		return allytips;
	}
	public String getKey() {
		return key;
	}
	public String getLore() {
		return lore;
	}
	public Integer getId() {
		return id;
	}
	public String getBlurb() {
		return blurb;
	}
	public List<ChampionSpell> getSpells() {
		return spells;
	}

}
