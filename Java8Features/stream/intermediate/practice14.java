package stream.intermediate;

import java.util.List;

public class practice14 {

    void main(){
        List<Integer> numbers  =  List.of(1,32,4,23,53,81,25,61,34,89,62);
        List<Integer> result = numbers.stream().takeWhile(n->n<50).toList();
        IO.println(result);

        List<Integer> result2 = numbers.stream().dropWhile(n->n<50).toList();
        IO.println(result2);
    }
}
