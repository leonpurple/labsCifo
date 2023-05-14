package Person;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class PersonRepository implements JpaRepository<Person, Integer> {
}
