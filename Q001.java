import java.util.Scanner;

public class Q001{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
    
        int i=0; int sum=0;
        if(N>=i) {
            String sNum=sc.next();
            char[] cNum=sNum.toCharArray();
            sum+=cNum[i]-'0';
            i++;
        }
        // int sum=0;
        // for(int i=0;i<cNum.length;i++){
        //     sum+=cNum[i]-'0';
        // }
        System.out.print(sum);
    }
}