public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Currently dispensing. Please wait.");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed");
        machine.decreaseInventory();
        if (machine.hasInventory()) {
            machine.setState(new IdleState());
        } else {
            machine.setState(new OutOfOrderState());
        }
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order");
        machine.setState(new OutOfOrderState());
    }
}