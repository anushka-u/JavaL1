package stream.easy;

import java.lang.reflect.Array;
import java.util.List;
//Remove duplicate integers from a list.
public class Practice5 {

    void main(){
        List<Integer> numbers = List.of(1,2,5,3,1,4,2,5,6,4,6,6,7,6,8,8,9);
        // Remove duplicates from the list using distinct()
        List<Integer> distinctNumbers = numbers.stream().sorted((a,b) -> b-a).distinct().toList();
        distinctNumbers.forEach(IO::println);
    }
}
