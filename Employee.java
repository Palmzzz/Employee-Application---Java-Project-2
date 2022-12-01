
/**
 * 
 * @author Milan Palmer
 */
public class Employee
{
    // The age of the employee
    private int age;
    // The number of days holiday the employee is entitled to
    private int numHolidays;
    // The name of this employee
    private String name;
    // The payscale of this employee
    private int payscale;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String givenName, int givenAge)
    {
        name = givenName;
        age = givenAge;
        numHolidays = 10;
        payscale = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumHolidays(){
        return numHolidays;
    }

    public int getPayscale(){
        return payscale;
    }

    public void setName(String newName){
        name=newName;
    }
    
    public void setNumHolidays(int updatedHolidays){
        numHolidays=updatedHolidays;
    }
    
    public void promote(){
        payscale = payscale+1;
    }
    
    public void increaseAge(){
        age = age+1;
    }
    
}


