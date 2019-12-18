import java.util.*;
public  class M3Q28{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(fun(n,m));
    }

    public static int fun(int x , int y){
        int p =Math.max(x,y);
        int i =Math.min(x,y);
        if(p%i==0){
            return i;
        }
        else{
            return fun(p%i,i);
        }
    }
}