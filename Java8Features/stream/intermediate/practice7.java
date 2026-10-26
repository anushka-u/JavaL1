package stream.intermediate;

import java.util.List;
//Given a list of names, find the longest name using max() and a Comparator.
public class practice7 {
    void main(){
        List<String> names = List.of("Alice","Bob","Charlie","Davidson","Elizabeth","Franky","Garter");
        int max = names.stream().map(str -> str.length()).max((a,b) -> a.compareTo(b)).orElse(-1);
        System.out.println(max);
    }
}
