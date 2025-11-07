package ie.atu.week7;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repo;
    public PersonService(PersonRepository repo) { this.repo = repo; }
    public Person create(Person p) { return repo.save(p); }
    public List<Person> findAll() { return repo.findAll(); }
    public Person findByEmployeeId(String id) {
        return repo.findByEmployeeId(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }

    public void deleteByID(long id){
        repo.deleteById(id);
    }

    public Person updateDepartmentByEmployeeID(String department, String id){
        Person current = findByEmployeeId(id);
        current.setDepartment(department);
        return repo.save(current);
    }


}
