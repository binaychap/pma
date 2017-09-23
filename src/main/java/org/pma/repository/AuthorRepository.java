package org.pma.repository;




import org.pma.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface AuthorRepository extends CrudRepository<Author, BigInteger> {

}
