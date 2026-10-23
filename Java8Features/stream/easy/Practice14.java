package stream.easy;

import java.util.List;
//Retrieve the first five elements of a list using limit()
public class Practice14 {
    void main(){
        List<Integer> numbers = List.of(2,5,1,4,6,3,7,8,9);
        List<Integer> result = numbers.stream().limit(5).toList();
        result.forEach(System.out::println);
    }
}
