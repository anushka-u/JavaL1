package stream.easy;

import java.util.List;
//Check whether any number is negative
public class Practice11 {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,-3,4,5,6,-7,8,-9,10);
        boolean hasNegativeNumber = numbers.stream().anyMatch(n->n<0);
        if(hasNegativeNumber){
                IO.println("List has negative number");
        }
        else{
            IO.println("List does not have negative number");
        }
    }
}
