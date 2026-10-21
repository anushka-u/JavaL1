package Java17Features.Records;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 20);
        Person person2 = new Person("Bob", 15);

        System.out.println(person1.age());
        System.out.println(person2.age());
        System.out.println(person1.name());
        System.out.println(person2.name());
        System.out.println(person1.name() + " is a student: " + Person.isStudent(person1));
        System.out.println(person2.name() + " is a student: " + Person.isStudent(person2));
    }
}
