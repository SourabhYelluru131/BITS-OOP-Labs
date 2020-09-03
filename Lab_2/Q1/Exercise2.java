import java.util.Scanner;

class Exercise2{
    public static void main(String args[]){
        int a=0,sum=0;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter an integer: ");
            a = in.nextInt();
            sum += a;
        }
        //prints sum
        System.out.println("The sum of the entered numbers is: "+ sum);
    }
}