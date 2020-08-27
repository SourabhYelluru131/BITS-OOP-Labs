/* Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n),
where F(n)=F(n–1)+ F(n–2) and F(1)=F(2)=1. Also compute their average.

 */
class Fibonacci{

    public static int sum=1;
    public static int trav=0;
    public static int compute(int a){
        if(a==0) return 0;
        if(a==1) return 1;
        int z = compute(a-1)+compute(a-2);
        if(a>trav){
            sum += z;
            trav = a;
        }
        return z;
    }

    public static void main(String[] args){
        int res = 1;
        int n = Integer.parseInt(args[0]);
        int a = compute(n);
        System.out.println(a);
        float av = (float) sum/n;
        System.out.println(av);
    }
}