import java.util.Locale;
import java.util.Scanner;

public class practice {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        System.out.println(str);
        str=str.replace(" ","_");
        System.out.println(str);

        String letter="Dear Harry,\n\tThis course is nice.\nThanks";
        System.out.println(letter);



    }
}
