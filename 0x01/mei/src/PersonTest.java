import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person person;

    @BeforeAll
    void setup() {
        person = new Person("Paul", "McCartney", new Date(2000), true, true, true);
        person.setSalary(1200);

    }

    @Test
    void show_full_name(){
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary(){

        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());

    }

    @Test
    void person_is_not_MEI() {
        person.setBirthDate(new Date(2020));
        assertFalse(person.isMEI());
    }

}
