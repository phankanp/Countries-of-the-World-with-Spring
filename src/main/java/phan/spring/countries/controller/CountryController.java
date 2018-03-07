package phan.spring.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import phan.spring.countries.data.CountryRepository;
import phan.spring.countries.model.Country;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap) {
        List<Country> allCountries = countryRepository.getAllCountries();
        modelMap.put("countries", allCountries);
        return "index";
    }

    @RequestMapping("/country/{name}")
    public String countryDetails(@PathVariable String name, ModelMap modelMap) {
        Country country = countryRepository.findByName(name);
        modelMap.put("detail", country);
        return "details";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String sortCountries(@RequestParam("sort") String sort, ModelMap modelMap) {
        List<Country> sortedCountries;
        sortedCountries = sortSelection(sort);
        modelMap.put("countries", sortedCountries);
        return "index";
    }

    public List<Country> sortSelection(String choice) {
        List<Country> allCountries = countryRepository.getAllCountries();

        if (choice.equals("Country Name")) {
            Collections.sort(allCountries, (Country c1, Country c2) -> c1.getName().compareTo(c2.getName()));
        }
        if (choice.equals("Population")) {
            Collections.sort(allCountries, (Country c1, Country c2) -> c1.getInt() - c2.getInt());
        }

        return allCountries;
    }
}
