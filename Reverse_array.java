
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();               //read input
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
             System.out.println(a[i]);        //reverse an array
        }


    }
}
