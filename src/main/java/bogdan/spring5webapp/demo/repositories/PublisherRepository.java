package bogdan.spring5webapp.demo.repositories;

import bogdan.spring5webapp.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
