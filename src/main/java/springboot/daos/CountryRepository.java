package springboot.daos;

import org.springframework.data.repository.CrudRepository;
import springboot.models.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
