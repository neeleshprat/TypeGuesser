package de.mannheim.uni.units;

import java.util.ArrayList;
import java.util.List;

/**
 * @author petar
 * 
 */
public class SubUnit {

	private String name;

	boolean isConvertible;

	private double rateToConvert;

	private List<String> abbrevations;

	private Unit baseUnit;

	private String newValue;

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public Unit getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(Unit baseUnit) {
		this.baseUnit = baseUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isConvertible() {
		return isConvertible;
	}

	public void setConvertible(boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	public double getRateToConvert() {
		return rateToConvert;
	}

	public void setRateToConvert(double rateToConvert) {
		this.rateToConvert = rateToConvert;
	}

	public List<String> getAbbrevations() {
		return abbrevations;
	}

	public void setAbbrevations(List<String> abbrevations) {
		this.abbrevations = abbrevations;
	}

	public void setAbbrevationsFromStringField(String[] abbrs) {

		for (String str : abbrs) {
			abbrevations.add(str.replace("\"", ""));
		}
	}

	public SubUnit() {
		abbrevations = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
}
