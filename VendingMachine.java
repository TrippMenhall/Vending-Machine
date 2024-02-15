public class VendingMachine {
    private String[] snacks = {"Chips", "Chocolate Bar", "Popcorn", "Pretzels", "Candy", "Nuts"};

    public String[] getSnacks() {
        return snacks;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        String[] availableSnacks = vendingMachine.getSnacks();

        System.out.println("Available snacks in the vending machine:");
        for (String snack : availableSnacks) {
            System.out.println(snack);
        }
    }
}