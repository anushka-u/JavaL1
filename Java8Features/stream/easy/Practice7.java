package stream.easy;

import java.util.List;
//Sort a list of strings in descending alphabetical order.
public class Practice7 {
    public static void main(String[]  args){
        List<String> names = List.of("Pooja", "Jane", "Alice", "Bob","Zack");
        names.stream().sorted((a,b)-> b.compareTo(a)).forEach(IO::println);
    }
}
