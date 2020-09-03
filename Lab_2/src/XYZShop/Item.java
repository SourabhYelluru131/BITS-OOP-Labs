package XYZShop;
public class Item {
    //Attributes
    private String itemName, itemidNo;
    private int itemQuantity;
    private double itemPrice;

    //Methods
    public Item(String itemName, String itemidNo, int itemQuantity, int itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public Item(String itemName, String itemidNo, int itemQuantity) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        itemPrice = 500;
    }

    public Item(String itemName, String itemidNo) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        itemQuantity = 1;
        itemPrice = 500;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemidNo() {
        return itemidNo;
    }

    public void setItemidNo(String itemidNo) {
        this.itemidNo = itemidNo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
