package id.purnama.demo.orika.mapper;

import id.purnama.demo.orika.dto.Personne;
import id.purnama.demo.orika.entity.Person;
import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper implements OrikaMapperFactoryConfigurer {

    @Override
    public void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(Person.class, Personne.class)
                .field("name", "nom").
                field("nickname", "surnom").
                byDefault().register();
    }
}
