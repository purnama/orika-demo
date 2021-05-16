package id.purnama.demo.orika.service;

import id.purnama.demo.orika.dto.Destination;
import id.purnama.demo.orika.dto.Personne;
import id.purnama.demo.orika.entity.Person;
import id.purnama.demo.orika.entity.Source;
import id.purnama.demo.orika.repository.PersonRepository;
import id.purnama.demo.orika.repository.SourceRepository;
import lombok.AllArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MapperService {

    @Autowired
    private SourceRepository sourceRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MapperFacade mapperFacade;

    public Destination getDestination(Long sourceId) {
        return mapperFacade.map(sourceRepository.findById(sourceId).get(), Destination.class);
    }

    public Personne getPersonne(Long personId) {
        return mapperFacade.map(personRepository.findById(personId).get(), Personne.class);
    }
}
