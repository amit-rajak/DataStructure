package IntesrviewTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass {

    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101,"Rahul");
        map1.put(103,"Raj");
        map1.put(106,"Chinna");
        map1.put(105,"Rahim");

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Chinna",50000.0);
        map2.put("Rahim",60000.0);
        map2.put("Raj",70000.0);
        map2.put("Rahul",20000.0);
      //  sort the second map based on values & then map keys from first map
      //  Expected Output first two :
      //  103,70000 105,60000

        //
        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(map2.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        System.out.println(sortedEntries);
        for (int i = 0; i < 2; i++) { // Limiting to first two entries
            String name = sortedEntries.get(i).getKey();
            Double salary = sortedEntries.get(i).getValue();

            // Find corresponding key from map1
            for (Map.Entry<Integer, String> entry : map1.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + "," + salary);
                    break;
                }
            }
        }




    }
}
