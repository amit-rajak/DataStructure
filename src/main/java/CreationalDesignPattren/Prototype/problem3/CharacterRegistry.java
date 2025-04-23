package CreationalDesignPattren.Prototype.problem3;

import CreationalDesignPattren.Prototype.problem2.LoanPrototype;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {

    Map<String, RPGgame>  registry = new HashMap<>();

    public  void setRegistry(String reg, RPGgame rpGgame){
        registry.put(reg, rpGgame);
    }

    public   RPGgame  getRegistry(String rpGameTpe){
        RPGgame prototype = registry.get(rpGameTpe);
        return prototype != null ? prototype.clone() : null;
    }
}
