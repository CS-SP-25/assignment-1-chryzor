import java.text.DecimalFormat;

public class State {
     String name;
     SalesTaxBehavior taxBehavior;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n",value, this.name,tax);
    }
}
