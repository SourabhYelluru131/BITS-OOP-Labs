package bicycle;
public class Bicycle {

    //fields
    public int speed = 100;
    public int noOfGears = 5;
    public int cadence = 40;

    private static int var=10;

    // methods
    public static void setVar(int x){
        var = x;
    }

    public static void printVar(){
        System.out.println(var);
    }
    public void printState() {
        System.out.println("Bicycle [cadence=" + cadence + ", noOfGears=" + noOfGears + ", speed=" + speed + "]");
    }
}