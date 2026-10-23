package stream.easy;

import java.util.List;

//Convert a list of strings to their respective lengths
public class Practice4 {
    void main(){
        List<String> list = List.of("apple", "banana", "cherry", "date");
        // Convert strings to their respective lengths using map()
        List<Integer> lengths = list.stream().map(String::length).toList();
        lengths.forEach(IO::println);
    }
}
