import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


// we need longest string from  imutable list using steam
public class newTest {

    public static void main(String[] args) {

        List<String> list=  new ArrayList<>();
        list.add("findtestlist");list.add("Amit");
        list.add("Kumar");
        list.add("TestList");

        Collections.unmodifiableList(list);




        list.stream();



        List<String> list2=  new ArrayList<>(100);





    }

}
