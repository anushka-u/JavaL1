package stream.easy;

import java.util.List;
//
public class Practice12 {
    void main(){
        List<Integer> numbers = List.of(2,5,1,4,6,3,7,8,9);
        boolean hasAlllPositiveNumber = numbers.stream().allMatch(n->n>0);
        if(hasAlllPositiveNumber) {
            IO.println("List has all positive number");
        }
        else{
            IO.println("List does not have all positive number");
        }
    }
}
