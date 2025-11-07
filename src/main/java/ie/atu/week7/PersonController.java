package ie.atu.week7;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@Valid @RequestBody Person person) {
        return service.create(person);
    }

    @GetMapping
    public List<Person> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person byEmployeeId(@PathVariable String id) {
        return service.findByEmployeeId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteByEmployeeId(@PathVariable long id){
        service.deleteByID(id);
    }

    @PutMapping("/{employeeID}")
    public Person updateByID(@PathVariable String employeeID, @RequestBody String department){
        return service.updateDepartmentByEmployeeID(employeeID, department);
    }


}