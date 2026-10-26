package stream.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class practice12 {

    void main(){

        List<Integer> numbers =  Stream.iterate(1, n -> n*3).limit(20).toList();
        numbers.forEach(System.out::println);
        IO.println(numbers);
    }
}
