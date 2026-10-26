package stream.intermediate;

import java.util.List;

//Find the sum of all integers using reduce().
public class Practice3 {
    void main(){
        List<Integer> numbers  =  List.of(1,2,3,4,5,6,7,8,9,10);
        int sumofAll =  numbers.stream().reduce(0,(a,b)->a+b);
        IO.println("Sum of all integers is: "+sumofAll);
    }
}
