package StreamP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String arr[]={"Java", "Python", "C#", "Java", "Kotlin", "Python"};
        List<String> data= Arrays.asList(arr);
        Set<String> s= new HashSet<>();
      List<String> list=  data.stream().distinct().collect(Collectors.toList());
      System.out.println(list);
    }
}
