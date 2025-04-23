package IntesrviewTest;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class freq {
    //{ =4, a=3, c=1, C=1, D=1, e=2, f=1, h=1, J=1, n=1, O=1, o=1, p=1, T=1, t=1, v=1, y=1}

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character,Long> map=
                inputString.chars().mapToObj(m->(char)m).

                        collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);



    }
}
