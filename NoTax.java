//Implement the behaviors
class NoTax implements SalesTaxBehavior {
    public double compute(double value){
        return value * 0.0; // No sales tax
    }
}