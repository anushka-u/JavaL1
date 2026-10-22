package recordPattern;

public class recordPattern21FeatureDemo {
    public static void main(String[] args){
        record Employee(String name, int age){}

        Employee emp = new Employee("John Doe", 30);

        if(emp instanceof Employee(String name, int age)) {
            System.out.println("Employee Name: " + name + ", Age: " + age);
        }
    }
}
