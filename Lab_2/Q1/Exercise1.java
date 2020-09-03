import java.io.*;

public class Exercise1{

    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum=0;
        //Take 10 integer inputs
        for(int i=0;i<10;i++) {
            System.out.println("Enter Integer: ");
            //Parsing input to integer
            int input = Integer.parseInt(br.readLine());
            sum += input;
        }
        //Print the sum
        System.out.println("The sum of the numbers entered is : " +sum);
    }

}
