import java.util.Scanner;

public class codeup_1019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String members=sc.nextLine();
        String pieces[]=members.split("\\.");
        
        // for (String piece : pieces) {
        //     System.out.print(piece);
        // }

        //System.out.println(pieces[0]+"."+pieces[1]+"."+pieces[2]);
        
        int p0=Integer.parseInt(pieces[0]);
        int p1=Integer.parseInt(pieces[1]);
        int p2=Integer.parseInt(pieces[2]);

        System.out.printf("%04d.%02d.%02d", p0, p1, p2);
    }
}
