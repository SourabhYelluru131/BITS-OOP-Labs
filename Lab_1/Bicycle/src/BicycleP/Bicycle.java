package BicycleP;
public class Bicycle {

    //fields
    int speed = 100;
    int noOfGears = 5;
    int cadence = 40;

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
    public static void main(String[] args){

    }
}