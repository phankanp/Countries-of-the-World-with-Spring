package phan.spring.countries.model;

import java.util.Collections;
import java.util.List;

public class Country {
    private String name;
    private String population;
    private String capitalCity;
    private List<String> languages;

    public Country(String name, String population, String capitalCity, List<String> languages) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public int getInt() {
        int population = Integer.parseInt(getPopulation().replaceAll(",", ""));

        return population;
    }

}
