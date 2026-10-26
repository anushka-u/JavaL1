package stream.intermediate;

import java.util.List;
//Find the product of all integers using reduce().
public class Practice4 {

    void main(String[] args){
        List<Integer> list = List.of(1,3,2,5,6,3,9,7);
        Integer productOfAll =  list.stream().reduce(1,(a,b)->a*b);
        IO.println(productOfAll);
    }
}
