package CreationalDesignPattren.Prototype.problem2;

public class CarLoan implements  LoanPrototype{

    private double interestRate;
    private int tenure;
    private boolean includesInsurance;

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

    public boolean isIncludesInsurance() {
        return includesInsurance;
    }

    public void setIncludesInsurance(boolean includesInsurance) {
        this.includesInsurance = includesInsurance;
    }

    public CarLoan(double interestRate, int tenure, boolean includesInsurance) {
        this.interestRate = interestRate;
        this.tenure = tenure;
        this.includesInsurance = includesInsurance;
    }



    @Override
    public LoanPrototype clone() {
        return new CarLoan(this.interestRate,this.tenure,this.includesInsurance);
    }

    @Override
    public String toString() {
        return "CarLoan{" +
                "interestRate=" + interestRate +
                ", tenure=" + tenure +
                ", includesInsurance=" + includesInsurance +
                '}';
    }
}
