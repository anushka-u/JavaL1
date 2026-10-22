package sequencedCollection;

import java.util.ArrayList;
import java.util.List;

public class demo {


    /***
     * Java 21 introduced Sequenced Collections through JEP 431. It added interfaces such as SequencedCollection,
     * SequencedSet, and SequencedMap to provide consistent APIs for accessing the first and last elements,
     * adding elements at either end where supported, and processing collections in reverse order.
     * This reduces the need for collection-specific workarounds.
     */
    void main(){
        List<String> list = new ArrayList<>(List.of("Amit", "John", "Steve", "Payal", "Kunal"));
        IO.println(list.getLast());
        IO.println(list.getFirst());
        IO.println(list.reversed());

    }
}
