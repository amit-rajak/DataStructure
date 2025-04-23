package CreationalDesignPattren.Prototype.problem2;

public class HomeLoan implements  LoanPrototype{


    private  double interestRate;
    private  int tenure ;
    private  double processingFee;

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

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public HomeLoan(double interestRate, int tenure, double processingFee) {
        this.interestRate = interestRate;
        this.tenure = tenure;
        this.processingFee = processingFee;
    }

    @Override
    public LoanPrototype clone() {
        return new HomeLoan(this.interestRate,this.tenure,this.processingFee);

    }

    @Override
    public String toString() {
        return "HomeLoan{" +
                "interestRate=" + interestRate +
                ", tenure=" + tenure +
                ", processingFee=" + processingFee +
                '}';
    }
}
