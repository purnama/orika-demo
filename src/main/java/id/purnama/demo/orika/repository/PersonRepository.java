package id.purnama.demo.orika.repository;

import id.purnama.demo.orika.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
