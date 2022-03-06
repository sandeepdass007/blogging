package com.blogging.designpattern.prototype;

public class Province implements Cloneable {

	private String name;
	private Integer malePopulation;
	private Integer femalePopulation;
	private Integer otherPopulation;
	private String continent;
	private String countryName;
	private Integer countryMalePopulation;
	private Integer countryFemalePopulation;
	private Integer countryOtherPopulation;
	private Float countryGdp;

	private Province() {
		super();
	}

	public Province(String name, Integer malePopulation, Integer femalePopulation, Integer otherPopulation,
			String continent, String countryName, Integer countryMalePopulation, Integer countryFemalePopulation,
			Integer countryOtherPopulation, Float countryGdp) {
		super();
		this.name = name;
		this.malePopulation = malePopulation;
		this.femalePopulation = femalePopulation;
		this.otherPopulation = otherPopulation;
		this.continent = continent;
		this.countryName = countryName;
		this.countryMalePopulation = countryMalePopulation;
		this.countryFemalePopulation = countryFemalePopulation;
		this.countryOtherPopulation = countryOtherPopulation;
		this.countryGdp = countryGdp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMalePopulation() {
		return malePopulation;
	}

	public void setMalePopulation(Integer malePopulation) {
		this.malePopulation = malePopulation;
	}

	public Integer getFemalePopulation() {
		return femalePopulation;
	}

	public void setFemalePopulation(Integer femalePopulation) {
		this.femalePopulation = femalePopulation;
	}

	public Integer getOtherPopulation() {
		return otherPopulation;
	}

	public void setOtherPopulation(Integer otherPopulation) {
		this.otherPopulation = otherPopulation;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountryMalePopulation() {
		return countryMalePopulation;
	}

	public void setCountryMalePopulation(Integer countryMalePopulation) {
		this.countryMalePopulation = countryMalePopulation;
	}

	public Integer getCountryFemalePopulation() {
		return countryFemalePopulation;
	}

	public void setCountryFemalePopulation(Integer countryFemalePopulation) {
		this.countryFemalePopulation = countryFemalePopulation;
	}

	public Integer getCountryOtherPopulation() {
		return countryOtherPopulation;
	}

	public void setCountryOtherPopulation(Integer countryOtherPopulation) {
		this.countryOtherPopulation = countryOtherPopulation;
	}

	public Float getCountryGdp() {
		return countryGdp;
	}

	public void setCountryGdp(Float countryGdp) {
		this.countryGdp = countryGdp;
	}
	
	@Override
	public Province clone() throws CloneNotSupportedException {
		Province province = new Province();
		province.name = this.name;
		province.malePopulation = this.malePopulation;
		province.femalePopulation = this.femalePopulation;
		province.otherPopulation = this.otherPopulation;
		province.continent = this.continent;
		province.countryName = this.countryName;
		province.countryMalePopulation = this.countryMalePopulation;
		province.countryFemalePopulation = this.countryFemalePopulation;
		province.countryOtherPopulation = this.countryOtherPopulation;
		province.countryGdp = this.countryGdp;
		return province;
	}
	
	@Override
	public String toString() {
		return String.format("[Name: %s, Male Population: %d, Female Population: %d, Other Population: %d, Continent: %s, Country: %s, "
				+ "Country Male Population: %d, Country Female Population: %d, Country Other Population: %d, Country GDP: %f]", this.name,
				this.malePopulation, this.femalePopulation, this.otherPopulation, this.continent, this.countryName, this.countryMalePopulation,
				this.countryFemalePopulation, this.countryOtherPopulation, this.countryGdp);
	}

}
