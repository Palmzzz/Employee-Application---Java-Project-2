
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EmployeeTest.
 * @author  Milan palmer
 */
public class EmployeeTest
{
    /**
     * Default constructor for test class EmployeeTest
     */
    public EmployeeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void nameCorrect() {
        Employee emp1 = new Employee("James", 20);
        assertEquals("James", emp1.getName());
        Employee emp2 = new Employee("Sarah", 25);
        assertEquals("Sarah", emp2.getName());
    }

    @Test
    public void ageCorrect() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(20, emp1.getAge());
        Employee emp2 = new Employee("Sarah", 25);
        assertEquals(25, emp2.getAge());
    }

    @Test
    public void numHolidays() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(10, emp1.getNumHolidays());
        Employee emp2 = new Employee("Sarah", 25);
        assertEquals(10, emp2.getNumHolidays());
    }

    @Test
    public void payscale() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(1, emp1.getPayscale());
        Employee emp2 = new Employee("Sarah", 25);
        assertEquals(1, emp2.getPayscale());
    }

    @Test
    public void changeName() {
        Employee emp1 = new Employee("Sarah", 25);
        assertEquals("Sarah", emp1.getName());
        emp1.setName("Sarah Someone");
        assertEquals("Sarah Someone", emp1.getName());
    }    

    @Test
    public void updateNumHolidays() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(10, emp1.getNumHolidays());
        emp1.setNumHolidays(15);
        assertEquals(15, emp1.getNumHolidays());
    }

    @Test
    public void updatePayscale() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(1, emp1.getPayscale());
        emp1.promote();
        assertEquals(2, emp1.getPayscale());
        emp1.promote();
        assertEquals(3, emp1.getPayscale());
    }

    @Test
    public void haveBirthday() {
        Employee emp1 = new Employee("James", 20);
        assertEquals(20, emp1.getAge());
        emp1.increaseAge();
        assertEquals(21, emp1.getAge());
        emp1.increaseAge();
        assertEquals(22, emp1.getAge());
    }

}
