public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coin");
    }
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted");
        machine.setState(new DispensingState());
        // Automatically trigger dispense after coin insertion
        machine.dispenseItem();
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert coin first");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}