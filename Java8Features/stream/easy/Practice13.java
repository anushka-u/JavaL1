package stream.easy;

import java.util.List;

public class Practice13 {
    public static void main(String[] args){
        List<String> numbers = List.of("Parul","Priya","Kanta","Shravani","Riya","");
        boolean hasEmptyString = numbers.stream().anyMatch(String::isEmpty);
        if(hasEmptyString) {
            IO.println("List has empty string");
        }
        else{
            IO.println("List does not have empty string");
        }
    }
}
