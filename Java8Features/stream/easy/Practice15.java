package stream.easy;

import java.util.List;

public class Practice15 {
    void main(){
        List<Integer> numbers = List.of(2,6,4,1,8,9,10,13,11,42,32);
        List<Integer> remainingNumbers = numbers.stream().skip(3).toList();
        remainingNumbers.forEach(System.out::println);
    }
}
