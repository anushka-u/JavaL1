package stream.intermediate;

import java.util.List;
//Given a list of lists of integers, flatten it into a single list.
public class practice2 {
    public static void main(String[] args){
        List<List<Integer>>  listOfList = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        List<Integer> flattenIntegerList = listOfList.stream().flatMap(List::stream).toList();
        IO.println(flattenIntegerList);
    }
}
