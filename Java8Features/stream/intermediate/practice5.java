package stream.intermediate;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

//Find the maximum and minimum numbers using Stream terminal operations.
public class practice5 {
    void main(){
        List<Integer> listOfNumber =  List.of(4,2,18,9,24,14,82,9,65);
        int maxInList =  listOfNumber.stream().max((a, b)-> a.compareTo(b)).orElse(-1);
        IO.println(maxInList);
        int minInList = listOfNumber.stream().min((a,b)->a.compareTo(b)).orElse(0);
        IO.println(minInList);
    }
}
