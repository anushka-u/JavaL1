package stream.easy;

import java.util.List;
//Find the square of every number and collect the results into a List
public class Practice8 {
    void main(){
        List<Integer> numbers = List.of(2,5,1,4,6,3,7,8,9);
        List<Integer> squaredNumber = numbers.stream().map(n->n*n).toList();
        squaredNumber.forEach(System.out::println);
    }
}
