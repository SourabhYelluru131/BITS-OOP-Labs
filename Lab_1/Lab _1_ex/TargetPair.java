/*Given an unsorted input array, write a program to find the pair of numbers whose sum
is equal to X. Get the input as command line arguments.
 */
class TargetPair{
    public static void main(String[] args){
        int[] arr = new int[args.length-1];
        for(int i=0;i<args.length-1;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        int X = Integer.parseInt(args[args.length-1]);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==X){
                    System.out.println(arr[i] + " " +arr[j]);
                }
            }
        }
    }
}