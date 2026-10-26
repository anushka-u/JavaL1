package stream.intermediate;

import java.util.List;

//Given a list of sentences, extract all words into a single List<String> using flatMap().
public class Practice1 {
    void main(){
        List<String> sentences = List.of("Hello world", "Java stream API", "FlatMap example");
        List<String>words = sentences.stream().
                flatMap(sentence ->List.of(sentence.split((" "))).stream()).toList();
        System.out.println(words);
    }
}
