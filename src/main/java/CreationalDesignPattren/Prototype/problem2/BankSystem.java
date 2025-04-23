package CreationalDesignPattren.Prototype.problem2;

public class BankSystem {
    public static void main(String[] args) {
        // Create base prototypes
        LoanRegistry loanRegistry = new LoanRegistry();

        //Without Loan Registry
        HomeLoan baseHomeLoan = new HomeLoan(7.5, 240, 0.5);
        CarLoan baseCarLoan = new CarLoan(8.0, 60, true);
        PersonalLoan basePersonalLoan = new PersonalLoan(11.0, 36, false);

        // Clone and cast correctly
        HomeLoan customerHomeLoan = (HomeLoan) baseHomeLoan.clone();
        CarLoan customerCarLoan = (CarLoan) baseCarLoan.clone();
        PersonalLoan customerPersonalLoan = (PersonalLoan) basePersonalLoan.clone();

        // Print to confirm
        System.out.println("Customer Home Loan: " + customerHomeLoan);
        System.out.println("Customer Car Loan: " + customerCarLoan);
        System.out.println("Customer Personal Loan: " + customerPersonalLoan);


        System.out.println("============Loan Registry ==================");

        LoanRegistry registry = new LoanRegistry();

        // 🔧 Register prototypes
        registry.registerLoan("car", new CarLoan(8.0, 60, true));
        registry.registerLoan("home", new HomeLoan(7.5, 240, 0.5));
        registry.registerLoan("personal", new PersonalLoan(11.0, 36, false));

        CarLoan carLoan = (CarLoan) registry.getLoanCloneTemplate("car");
        System.out.println("CarLoan type :" + carLoan);


        carLoan.setTenure(48);  // Change the tenure after cloning
        carLoan.setIncludesInsurance(false); // Update insurance
        System.out.println("after Update CarLoan type :" + carLoan);



    }
}
