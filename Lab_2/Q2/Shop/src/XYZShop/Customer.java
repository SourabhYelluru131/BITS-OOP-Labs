package XYZShop;

public class Customer{
    //Attributes
    private String name,idNo;
    private double balance;
    private Item item;
    //Methods


    public Customer(String name,String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }

    public Customer(String name, String idNo) {
        this.name = name;
        this.idNo = idNo;
        this.balance = 5000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public double getBalance() {
        return balance;
    }

    public Item getItem() {
        return item;
    }

    public void print(){
        String a = this.item.getItemName();
        String b = this.item.getItemidNo();
        int q = this.item.getItemQuantity();
        double p = this.item.getItemPrice();
        this.balance -= p;
        item.setItemQuantity(q-1);
        double balance = getBalance();
        System.out.println("Item name: "+ a);
        System.out.println("Item ID: "+ b);
        System.out.println("Quantity: "+ q);
        System.out.println("Price: "+ p);
        System.out.println("Balance: "+ balance);
    }

    public void buyItem(Item item) {
        this.item = item;
        double price = item.getItemPrice();
        int available = item.getItemQuantity();
        if (available>=1){
            if (price <= balance) print();
            else {
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Order is not valid");
        }
    }


}
