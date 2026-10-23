package stream.easy;

import java.util.List;
//Find the first number greater than 100 in a list of integers using findFirst()
public class Practice10 {

    void main(){
        List<Integer> numbers = List.of(12,32,54,103,11448,92,193,160,171);
        int firstNumberGreaterThan100 = numbers.stream().filter(n->n>100).findFirst().orElse(-1);
        IO.println("First number greater than 100 is - "+firstNumberGreaterThan100);
    }
}
