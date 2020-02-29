package bogdan.spring5webapp.demo.repositories;

import bogdan.spring5webapp.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
