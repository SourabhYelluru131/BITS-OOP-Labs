package XYZShop;

public class Test {
    //Customer C1 = new Customer("Sourabh","0815",10000);

    public static void main(String[] args){
        Item item1 = new Item("FirstItem","t1",1,10);
        Item item2 = new Item("SecondItem","t2",1,20000);
        Customer C1 = new Customer("Name","0815",10000);
        C1.buyItem(item1);
        C1.buyItem(item1);
        C1.buyItem(item2);
    }
}
