package de.rohmio.lol.api.model;

import java.util.List;

public class MasteryTree {

	private List<MasteryTreeList> Resolve;
	private List<MasteryTreeList> Ferocity;
	private List<MasteryTreeList> Cunning;

	public List<MasteryTreeList> getResolve() {
		return Resolve;
	}
	public List<MasteryTreeList> getFerocity() {
		return Ferocity;
	}
	public List<MasteryTreeList> getCunning() {
		return Cunning;
	}

}
