package stream.easy;

import java.util.List;

//Convert a list of names to uppercase using map()
public class Practice3 {
    public static void main(String[] args){
        List<String> names =List.of("John", "Jane", "Alice", "Bob");
        // Convert names to uppercase using map()
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        upperCaseNames.forEach(IO::println);
    }
}
