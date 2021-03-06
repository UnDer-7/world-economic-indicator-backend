package com.gomes.mateus.core.port.driver;

import com.gomes.mateus.core.domain.country.Country;
import com.gomes.mateus.core.domain.country.Indicator;
import com.gomes.mateus.core.domain.shared.Page;
import com.gomes.mateus.core.domain.shared.Query;

public interface CountryService {
  Page<Country> listCountries(Query query);

  Page<Indicator> searchIndicatorByCountry(String countryCode, Query query);
}
