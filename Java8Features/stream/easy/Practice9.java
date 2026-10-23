package stream.easy;

import java.util.List;
//Count how many numbers in a list are divisible by 5.
public class Practice9 {
    void main(){
        List<Integer> numbers  = List.of(2,5,4,7,15,70,29,50,25,68,65);
        Long countOfNumberDividibleBy5 = numbers.stream().filter(n->n%5==0).count();
        IO.println("Count of Number in list divisible by 5 is - "+countOfNumberDividibleBy5);
    }
}
