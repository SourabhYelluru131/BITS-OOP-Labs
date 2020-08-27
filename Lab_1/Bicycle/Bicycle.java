class Bicycle {

    //fields
    int speed = 100;
    int noOfGears = 5;
    int cadence = 40;

    // methods
    public void printState() {
        System.out.println("Bicycle [cadence=" + cadence + ", noOfGears=" + noOfGears + ", speed=" + speed + "]");
    }

    public static void main(String[] args){
        // create an instance of the Bicycle class
        Bicycle b1 = new Bicycle();

        //Invoke method object b1 of type Bicycle
        b1.printState();
    }

}