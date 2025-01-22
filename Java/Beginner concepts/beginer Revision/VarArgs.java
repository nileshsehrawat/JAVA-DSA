public class VarArgs {
    public static void main (String[] args){
        int ans = sum(2,4,6,8  );
        System.out.println(ans);
    }
    static int sum (  int... v){
        int sum=0;
        for (int i : v){
            sum += i;

        }
        return sum;
    }


}
