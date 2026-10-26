package stream.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class practice13 {
void main(){
    List<String> nameofGirls = List.of("Alice", "Bob", "Charlie", "David", "Eve");
    List<String> nameOfBoys = List.of("Frank", "George", "Harry", "Ian", "Jack");

    //In reversed order
    List<String> finalNames = Stream.concat(nameOfBoys.stream(), nameofGirls.stream()).sorted((a,b)-> b.compareTo(a)).toList();
    IO.println(finalNames);
}
}
