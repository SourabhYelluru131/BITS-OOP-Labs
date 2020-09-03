package bicycle;
public class BicycleDemo{
    public static void main(String[] args){
        // create an instance of the Bicycle class
        Bicycle  b1 = new Bicycle();

        //Invoke method object b1 of type Bicycle
        b1.printState();
        //b1.setVar(100);
        //b1.printVar();

        Bicycle.setVar(1000);
        Bicycle.printVar();
        //b1.printVar();
    }
}

