package stream.easy;

import java.util.List;
//Sort a list of integers in ascending order using sorted()
public class Practice6 {
    void main(){
        List<Integer> numbers = List.of(2,5,1,4,6,3,7,8,9);
        List<Integer> sortedNumber = numbers.stream().sorted().toList();
        sortedNumber.forEach(IO::println);
    }
}
