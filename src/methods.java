import java.util.Scanner;

public class methods {

    static int SumOfFirstNaturalNum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;

        }return sum;

    }
    static int SumOfSecondNaturalNum( int m){
        int s=0,j=1;
        while (j<=m){
            s=s+j;
            j++;
        }return s;

    }


    public static void main(String [] args){
        int n=50,m=50;
        System.out.println("value is:" +SumOfFirstNaturalNum(n));
        System.out.println("value2 is:" + SumOfSecondNaturalNum(m));


    }




}