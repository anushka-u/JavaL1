package StreamToList;

import java.util.List;
import java.util.stream.Collectors;

public class demo{
    public static void main(String [] args){
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        //Before java16
        List<String> list =  names.stream().filter(name -> name.length()>3).collect(Collectors.toList());
        System.out.println(list);
        //After java16
        List<String> list2 = names.stream().filter(name -> !name.startsWith("A")).toList();
        System.out.println(list2);
    }
}