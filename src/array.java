import java.util.Scanner;

public class array {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers for addition");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is:" +sum);
        System.out.println("enter two float numbers");
        Scanner sf=new Scanner(System.in);
        float a1= sf.nextFloat();
        float b1=sf.nextFloat();
        float value=a1+b1;
        System.out.println("value is:"+value);

        Scanner si=new Scanner(System.in);
        System.out.println("Enter Principle amt:");
        float p= si.nextFloat();
        System.out.println("Enter time period:");
        float t= si.nextFloat();
        System.out.println("Enter rate of interest:");
        float r= si.nextFloat();
        float s=(p*t*r)/100;
        System.out.println("si is:"+s);
    }
}
