public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        if (machine.hasInventory()) {
            System.out.println("Item selected");
            machine.setState(new ItemSelectedState());
        } else {
            System.out.println("Out of inventory");
            machine.setState(new OutOfOrderState());
        }
    }
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please select an item first");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please select an item first");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}