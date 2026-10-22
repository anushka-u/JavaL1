package recordPattern;

public class recordPatternDemoBefore21 {
    /***Record pattern became standard feature in Java 21. It allows you to deconstruct records in pattern matching,
     making it easier to work with record types.
    Before Java 21, you could only match against the type of a record, but not extract its components directly in a pattern.
     With record patterns, you can now match and extract the components of a record in a single step.
     * This example covers record Pattern before java 21*/
    void main(){
        //Define a record

        record Employee(String name, int age){}

        //Create an instance of the record
        Employee emp =  new Employee("John Doe", 30);
        if (emp instanceof Employee(String name, int age)) {
            IO.println("Employee Name: " + emp.name() + ", Age: " + emp.age());
        }
    }
}
