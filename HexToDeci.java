import java.util.Scanner;

public class HexToDeci {
    public static void main(String args[]) {
        String str="";
        int n, rem, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n>0) {
            rem = n%16;
            if(rem == 10) {
                str = str + "A";
            }
            else if(rem == 11) {
                str = str + "B";
            }
            else if(rem == 12) {
                str = str + "C";
            }
            else if(rem == 13) {
                str = str + "D";
            }
            else if(rem == 14) {
                str = str + "E";
            }
            else if(rem == 15) {
                str = str + "F";
            }
            else {
                str = str + rem;
            }
            n = (int) n/16;
        }
        for(i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
