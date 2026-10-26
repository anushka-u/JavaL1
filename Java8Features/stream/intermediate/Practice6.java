package stream.intermediate;

import java.util.List;

//Convert a list of numeric strings into integers and calculate their sum.
public class Practice6 {

    void main(){
        List<String> numbers =  List.of("1","2","8","90","23","65");
        int sumOfAll =  numbers.stream().map(a-> Integer.valueOf(a)).reduce(0,(a,b)->a+b);
        System.out.println(sumOfAll);
    }
}
