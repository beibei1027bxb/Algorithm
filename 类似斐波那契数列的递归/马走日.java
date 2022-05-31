package io.github.s0nata;

//马走日的代码
//给你一个当前位置，问从源地址到目的地址有多少走法
public class test1 {
    public static int f(int x,int y,int c_x,int c_y,int k){
        if (k==0&&c_x==x&&c_y==y) return 1;
        if (k==0) return 0;
        if (c_x<0||c_x>9||c_y<0||c_y>8) return 0;
        return f(x,y,c_x+1,c_y+2,k-1)+f(x,y,c_x+2,c_y+1,k-1)+f(x,y,c_x+2,c_y-1,k-1)+f(x,y,c_x-1,c_y+2,k-1)+
                f(x,y,c_x-2,c_y+1,k-1)+f(x,y,c_x-2,c_y-1,k-1)+f(x,y,c_x-1,c_y-2,k-1)+f(x,y,c_x+1,c_y-2,k-1);
    }

    public static int dp_f(int k,int x,int y,int c_x,int c_y){
        int[][][] dp=new int[10][9][k+1];
        dp[c_x][c_y][0]=1;
        for (int level = 1; level <k+1 ; level++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 9; j++) {
                    dp[i][j][level]=getValue(dp,i+1,j+2,level-1)+
                            getValue(dp,i+2,j+1,level-1)+
                            getValue(dp,i+2,j-1,level-1)+
                            getValue(dp,i-1,j+2,level-1)+
                            getValue(dp,i-2,j+1,level-1)+
                            getValue(dp,i-2,j-1,level-1)+
                            getValue(dp,i-1,j-2,level-1)+
                            getValue(dp,i+1,j-2,level-1);

                }
            }
        }
        return dp[x][y][k];


    }
    public static int getValue(int[][][] dp,int c_x,int c_y,int k){
        if (c_x<0||c_x>9||c_y<0||c_y>8) return 0;
        return dp[c_x][c_y][k];
    }
    public static void main(String[] args) {
        System.out.println(f(3, 4, 1, 1, 3));
        System.out.println(dp_f(3,3,4,1,1));
    }
}
