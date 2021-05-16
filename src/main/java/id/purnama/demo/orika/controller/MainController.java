package id.purnama.demo.orika.controller;

import id.purnama.demo.orika.dto.Destination;
import id.purnama.demo.orika.dto.Personne;
import id.purnama.demo.orika.service.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MapperService mapperService;

    @GetMapping("/sources/{sourceId}")
    public Destination getSource(@PathVariable(value = "sourceId") Long sourceId){
        return mapperService.getDestination(sourceId);
    }

    @GetMapping("/persons/{personId}")
    public Personne getPersonne(@PathVariable(value = "personId") Long personId){
        return mapperService.getPersonne(personId);
    }
}
