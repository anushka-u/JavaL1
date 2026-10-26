package stream.intermediate;

import java.util.List;

public class practice11 {
 //Convert a list of strings to a typed String array.
    void main(){
        List<String> list = List.of("apple", "banana", "cherry", "date");
        String[] array = list.stream().toArray(String[]::new);
        for(String s: array){
            System.out.println(s);
        }
    }
}
