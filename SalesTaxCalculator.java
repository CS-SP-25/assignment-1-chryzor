public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Ensure correct number of arguments
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <State> <SaleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        // Parse sale amount
        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please provide a numeric value.");
            return;
        }

        State provinces;

        // Determine the state
        switch (stateName) {
            case "Alaska":
                provinces = new Alaska();
                break;
            case "Indiana":
                provinces = new Indiana();
                break;
            case "Hawaii":
                provinces = new Hawaii();
                break;

                default:
                System.out.println("Unsupported state: " + stateName);
                return;
        }

        // TAx being shown
        provinces.showTax(saleAmount);
    }
}

