public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine(5); // Start with 5 items

        System.out.println("--- Testing normal flow ---");
        machine.selectItem();  // Should work
        machine.insertCoin();  // Should dispense
        
        System.out.println("\n--- Testing invalid operations ---");
        machine.insertCoin();  // Should fail (no item selected)
        
        System.out.println("\n--- Testing out of order ---");
        machine.setOutOfOrder();
        machine.selectItem();  // Should fail
        machine.insertCoin();  // Should fail
        machine.dispenseItem(); // Should fail
    }
}