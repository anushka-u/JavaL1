package stream.easy;

import java.util.List;

//Given a list of integers, return only numbers greater than 50. - easy
public class practice2 {
    void main(){
        List<Integer> numbers= List.of(10,20,30,40,50,60,70,80,90,100);
        // Filter out numbers greater than 50 using streams
        List<Integer> greaterThan50 = numbers.stream().filter(n->n>50).toList();
        greaterThan50.forEach(IO::println);
    }
}
