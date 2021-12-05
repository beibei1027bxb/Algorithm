public class switchProblem {

    public String solution(boolean[] ans){
        int i=0;
        while (i< ans.length){
            if (ans[i]==false){
                for (int j = i; j < ans.length ; j++)  ans[j]=!ans[j];
                if (checkIFAllTrue(ans)) return "先手";
                else {
                    if (solution(ans).equals("后手")) return "先手";
                    else return "后手";
                }
            }
            i++;
        }
        return "先手";
    }
    public boolean checkIFAllTrue(boolean[] ans){
        boolean check=true;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]==false) check=false;
        }
        return check;
    }

    public static void main(String[] args) {
        boolean[] ans={true,true,false,true,true,false};
        switchProblem sp=new switchProblem();
        System.out.println(sp.solution(ans));
    }
}
