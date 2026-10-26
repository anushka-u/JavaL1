package stream.intermediate;

//Given a list of integers, calculate count, sum, minimum, maximum and average using summaryStatistics().

import java.util.IntSummaryStatistics;
import java.util.List;

public class practice9 {
    void main(){
        List<Integer> numbers = List.of(1,4,2,3,5,6,7,8,9,11);
        IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt(Integer::intValue)
                .summaryStatistics();
        IO.println(summaryStatistics.getAverage());
        IO.println(summaryStatistics.getCount());
        IO.println(summaryStatistics.getMax());
        IO.println(summaryStatistics.getMin());
        IO.println(summaryStatistics.getSum());
    }
}
