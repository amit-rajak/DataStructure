import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Invoice {
    String product;

    public String getProduct() {
        return product;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    Double amount;
    String status;
    Invoice (String p, double a, String s) {
        product = p;
        amount = a;
        status = s;
    }
}
 class Main {
    public static void main(String[] args) {
        List<Invoice> list = Arrays.asList (
                new Invoice("Item 1", 10.5, null),
                new Invoice("Item 2", 50, "verified"),
                new Invoice("Item 3", 22, "verified"),
                new Invoice("Item 4", 35.5, "not-verified"),
                new Invoice("Item 5", 28, "verified")
        );

      //Double result=
         //     list.stream().filter(l->l.equals("verified")).
              //        collect(Collectors.summingDouble(Invoice::getAmount));


        Double result = list.stream()
                .filter(invoice -> "verified".equals(invoice.getStatus())) // Filter by "verified" status
                .collect(Collectors.summingDouble(Invoice::getAmount));
        System.out.println("sum"+result);

    }
}