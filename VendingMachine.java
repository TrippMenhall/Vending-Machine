public class VendingMachine {
    // I added the prices by making a new array but
    // another option might be to do a 2d array but I didn't
    // know if that is better or not so I just did it the
    // simplest way I could think of

    private String[] snacks = {"Chips", "Chocolate Bar", "Popcorn", "Pretzels", "Candy", "Nuts"};
    private int[] prices = {1, 1, 2, 3, 2, 1};

    public String[] getSnacks() {
        return snacks;
    }

    public int[] getPrices() {
        return prices;
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        String[] availableSnacks = vendingMachine.getSnacks();
        int[] snackPrices = vendingMachine.getPrices();

        System.out.println("Available snacks in the vending machine:");
        /*
        // I don't know how this works and how to add the price into it
        for (String snack : availableSnacks) { 
            System.out.println(snack + " $" + price);
        }
        */
        for(int i = 0; i < availableSnacks.length; i++){
            System.out.println(availableSnacks[i] + " $" + snackPrices[i]);
        }
    }
}