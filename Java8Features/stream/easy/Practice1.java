package stream.easy;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, filter out all even numbers. - Easy
public class Practice1 {
    void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Filter out even numbers using streams
        List<Integer> even =  numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        even.forEach(System.out::println);    }
}
