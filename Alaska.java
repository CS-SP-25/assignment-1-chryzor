// Implemented  states
class Alaska extends State {
    public Alaska() {
        setName("Alaska");
        taxBehavior = new NoTax(); // No tax for Alaska
    }
}
