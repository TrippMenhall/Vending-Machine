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
        Choose your snack and insert money
        There will be a confirmation before the purchase is finalized
        ==========================================
        """);

        //create scanner to take in user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available snacks in the vending machine:");
     
        //for each snack in the array print out the snack with the price and increase index of price each time
        int j = 1;
        for(int i = 0; i < availableSnacks.length; i++){
            System.out.println(j + ". " + availableSnacks[i] + " $" + snackPrices[i]);
            j++;
        }

        //user is asked to select their snack, then program prints out selected snack and its price
        System.out.println("\nPlease select a snack by typing its number.");
        vendingMachine.setSelectedSnack(scanner.nextInt()-1);
        System.out.println("You chose " + vendingMachine.snacks[vendingMachine.getSelectedSnack()] + " that will cost $" + vendingMachine.prices[vendingMachine.getSelectedSnack()] + ".");

        //if(confirm == "y")

        //Ask user to insert money and set money to that amount
        System.out.println("\nPlease insert money");
        vendingMachine.setMoney(scanner.nextInt());

         //Ask user to confirm their snack choice
         System.out.println("You are purchasing " + vendingMachine.snacks[vendingMachine.getSelectedSnack()] + " for $" + vendingMachine.prices[vendingMachine.getSelectedSnack()] + ". Please type 'y' to confirm or 'n' to cancel");
         String confirm = scanner.next();
           
         if(confirm.equals("y")){
           // Checks to see if the price is greater than or less than the money inserted
           if(vendingMachine.prices[vendingMachine.getSelectedSnack()] < vendingMachine.getMoney()){
               // Sets the money to the change left from transaction and then outputs the money
               vendingMachine.setMoney(vendingMachine.getMoney() - vendingMachine.prices[vendingMachine.getSelectedSnack()]);
               System.out.println("Your change is $" + vendingMachine.getMoney());
           }else if(vendingMachine.prices[vendingMachine.getSelectedSnack()] > vendingMachine.getMoney()){
               // Outputs the ammount difference between money already inserted and money needed
               System.out.println("Please enter $" + (vendingMachine.prices[vendingMachine.getSelectedSnack()] - vendingMachine.getMoney()) + " more");
           }

           //departure message
           System.out.println("Great choice! I hope you enjoy your " + vendingMachine.snacks[vendingMachine.getSelectedSnack()]);
        }else if(confirm.equals("n")){
            System.out.println("you have been refunded $" + vendingMachine.getMoney());
        }
    

     
    }
}