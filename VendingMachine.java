import java.util.Scanner;

public class VendingMachine {

    //create arrays for snacks and prices
    private String[] snacks = {"Chips", "Chocolate Bar", "Popcorn", "Pretzels", "Candy", "Nuts"};
    private int[] prices = {1, 1, 2, 3, 2, 1};

    //returns snacks
    public String[] getSnacks() {
        return snacks;
    }

    //returns prices
    public int[] getPrices() {
        return prices;
    }

    //initialize money and create get and set methods
    int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //get and set for selected snack
    int selectedSnack = 0;

    public int getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(int selectedSnack) {
        this.selectedSnack = selectedSnack;
    }


    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        String[] availableSnacks = vendingMachine.getSnacks();
        int[] snackPrices = vendingMachine.getPrices();

        // Welcome statement and instructions
        System.out.println("""
        ==========================================
        Welcome to the Vending Machine!
        Enter the money and then choose your snack
        There will be a confirmation before the purchase is finalized
        ==========================================
        """);

        //create scanner to take in user input
        Scanner scanner = new Scanner(System.in);
        
        //Ask user to insert money and set money to that amount
        System.out.println("Please insert money");
        vendingMachine.setMoney(scanner.nextInt());

        System.out.println("Available snacks in the vending machine:");
     
        //for each snack in the array print out the snack with the price and increase index of price each time
        int j = 1;
        for(int i = 0; i < availableSnacks.length; i++){
            System.out.println(j + ". " + availableSnacks[i] + " $" + snackPrices[i]);
            j++;
        }

        //user is asked to select their snack, then program prints out selected snack and its price
        System.out.println("Please select a snack by typing its number.");
        vendingMachine.setSelectedSnack(scanner.nextInt()-1);
        System.out.println("You chose " + vendingMachine.snacks[vendingMachine.getSelectedSnack()] + " that will cost $" + vendingMachine.prices[vendingMachine.getSelectedSnack()] + ".");
    }
}