package StreamP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RmoveDup {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        list.stream().distinct().forEach(System.out::println);

        for(int i=0;i<list.size();i++){

        }



    }
}
