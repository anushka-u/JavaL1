package recordPattern;

public class demo {
    void main(){
        record Address(String street, String city, String state, String zipCode){}
        record Employee(String name, Address address){}

        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        Employee emp = new Employee("John Doe", address);

        if(emp instanceof Employee(String name, Address(String street, String city, String state, String zipCode))) {
           IO.println("Employee Name : " + name + " lives at " + street + ", " + city + ", " + state + " " + zipCode);
        }
    }
}
