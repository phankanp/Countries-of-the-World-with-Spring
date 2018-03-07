package phan.spring.countries.data;

import org.springframework.stereotype.Component;
import phan.spring.countries.model.Country;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static List<String> france = Arrays.asList("French", "English", "Spanish");
    private static List<String> italy = Arrays.asList("Italian", "English", "French");
    private static List<String> china = Arrays.asList("Standard Mandarin", "Cantonese", "English");
    private static List<String> japan = Arrays.asList("Japanese", "Ryukyuan", "English");
    private static List<String> canada = Arrays.asList("French", "English");

    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("France", "66,900,000", "Paris", france),
            new Country("Italy", "60,600,000", "Rome", italy),
            new Country("China", "1,379,000,000", "Beijing", china),
            new Country("Japan", "127,000,000", "Tokyo", japan),
            new Country("Canada", "36,290,000", "Ottawa", canada)
    );

    public Country findByName(String name) {
        return ALL_COUNTRIES.stream()
                .filter(country -> name.equals(country.getName()))
                .findFirst()
                .orElse(null);

    }

    public static List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }


}
