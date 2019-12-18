import java.util.*;
public  class M3Q26{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(power(a,b));
    }

    public static long power(int x , int y){
        if(y==1){
            return x;
        }
        else{
            return x*power(x,y-1);
        }
    }
}