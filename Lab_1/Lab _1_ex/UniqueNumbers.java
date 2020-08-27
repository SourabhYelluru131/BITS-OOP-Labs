/* Get a four-digit number as input, write a program that creates all possible unique three
digit numbers.
 */
class UniqueNumbers{
    public static void main(String[] args){
        String s = args[0];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(i!=j && j!=k && k!=i){
                        char[] temp = {s.charAt(i),s.charAt(j),s.charAt(k)};
                        String ans = new String(temp);
                        System.out.println(ans);
                    }
                }
            }
        }
    }
}
