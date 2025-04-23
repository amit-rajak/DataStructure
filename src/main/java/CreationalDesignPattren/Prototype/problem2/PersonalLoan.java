package CreationalDesignPattren.Prototype.problem2;
public class PersonalLoan implements LoanPrototype {

    private double interestRate;
    private int tenure;
    private boolean preApproved;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public boolean isPreApproved() {
        return preApproved;
    }

    public void setPreApproved(boolean preApproved) {
        this.preApproved = preApproved;
    }

    public PersonalLoan(double interestRate, int tenure, boolean preApproved) {
        this.interestRate = interestRate;
        this.tenure = tenure;
        this.preApproved = preApproved;
    }

    @Override
    public String toString() {
        return "PersonalLoan{" +
                "interestRate=" + interestRate +
                ", tenure=" + tenure +
                ", preApproved=" + preApproved +
                '}';
    }

    @Override
    public LoanPrototype clone() {
        return new PersonalLoan(this.interestRate,this.tenure,this.preApproved);
    }
}
