# Steps

- Gather current, accurate information on the five countries being included in the application. The information must include the following:
  - Country name
  - Population
  - Capital city
  - Official language(s)
  - Image of flag
- Create a Gradle project. Add all required Spring dependencies and create the directory and package structure of the application. Save all static assets into the proper directory.
- Write the application code, including a data repository and controller.
- Create the index view, which will serve as the homepage of the application. This view must contain the following:
  - A list of the countries you&#39;ve chosen
  - A small thumbnail image of each country&#39;s flag next to its name
  - A clickable link to each country&#39;s detail page (could be the country name and/or flag image)
- Create the detail view. This view must contain all required pieces of information for each country, presented in an easily-readable fashion.

- Add two ways of sorting the countries on the index page, for example by country name and by population.
- Pick a country with at least two official languages. On its detail page, render the languages as either an ordered or unordered list.
- In the repository class&#39;s method for fetching a single country object, use the streams API to filter the list of all countries down to the one being requested.
