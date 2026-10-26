package stream.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Join a list of names into one comma-separated String .
public class practice10 {
    void main(){
        List<String> names = List.of("Alice","Bob","Charlie","Davidson","Elizabeth","Franky","Garter");
        String joinedNames = names.stream().collect(Collectors.joining(","));
        IO.println(joinedNames);

        List<String> splitNames = Stream.of(joinedNames).map(str -> str.split(","))
                .flatMap(arr -> Stream.of(arr)).collect(Collectors.toList());
        IO.println(splitNames);
    }
}
