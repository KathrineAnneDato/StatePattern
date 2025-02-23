public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private double balance;
    public VendingMachine(int initialInventory) {
        this.inventory = initialInventory;
        this.balance = 0.0;
        this.currentState = new IdleState();
    }
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    public void selectItem() {
        currentState.selectItem(this);
    }
    public void insertCoin() {
        currentState.insertCoin(this);
    }
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
    public boolean hasInventory() {
        return inventory > 0;
    }
    public void decreaseInventory() {
        if (inventory > 0) {
            inventory--;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void addBalance(double amount) {
        this.balance += amount;
    }
    public VendingMachineState getCurrentState() {
        return currentState;
    }
}