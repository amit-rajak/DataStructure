package CreationalDesignPattren.Prototype.problem2;

import java.util.HashMap;
import java.util.Map;

public class LoanRegistry {

    private Map<String, LoanPrototype> loanPrototypeMap = new HashMap<>();

    public void registerLoan(String LoanType,LoanPrototype loanPrototype){
        loanPrototypeMap.put(LoanType,loanPrototype);
    }

    public  LoanPrototype  getLoanCloneTemplate(String loanType){
        LoanPrototype prototype = loanPrototypeMap.get(loanType);
        return prototype != null ? prototype.clone() : null;
    }
}
