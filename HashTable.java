
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rollNo,index;
        String name;
        final int m=n;
        String[] val=new String[m];
        for(int i=0;i<n;i++){
            rollNo=sc.nextInt();
            name=sc.next();
            index=hashfun(rollNo,n);
            val[index]=name;
        }
        int k=sc.nextInt();
        while(k--!=0){
            rollNo=sc.nextInt();
            index = hashfun(rollNo,n);
            System.out.println(val[index]);
        }
    }
    public static int hashfun(int val,int n){
            return val % n;
        }
}