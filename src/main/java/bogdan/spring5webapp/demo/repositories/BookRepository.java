package bogdan.spring5webapp.demo.repositories;

import bogdan.spring5webapp.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long > {

}
