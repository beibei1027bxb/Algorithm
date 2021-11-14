package io.github.s0nata;

public class math_pow {
    public static int calc_pow(int a,int pow){
        int result=1;
        int t=a;
        while (true){
            if ((pow & 1)!=0) result*=t;
            t=t*t;
            pow >>=1;
            if (pow==0) break;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        calc_pow(2,10);
    }
}
