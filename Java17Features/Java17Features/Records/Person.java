package Java17Features.Records;

public record Person(String name, int age) {

    public static boolean isStudent(Person person) {
        if (person.age < 18) {
            return true;
        }
        return false;
    }
}