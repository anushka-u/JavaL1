package stream.intermediate;

import java.util.List;

//Given a list of integers, return the squares of all odd numbers.
public class practice8 {
    void main(){
        List<Integer> numbers = List.of(1,4,2,3,5,7,6,12,4,31,9,87,16,90);
        List<Integer> squaresOfOdds = numbers.stream().filter(n -> n%2!=0)
                .map(n->n*n).toList();
        squaresOfOdds.forEach(IO::println);
        IO.println(squaresOfOdds);
    }
}

