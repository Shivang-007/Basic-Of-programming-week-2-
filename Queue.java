
import java.util.*;


class TestClass {
        public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int front=0;
        int rear=0;
        int n=sc.nextInt();
        int q[]=new int[100];
        for(int i=0;i<n;i++){
            char choice;
            choice=sc.next().charAt(0);
            if(choice=='E'){
                int item;
                item=sc.nextInt();
                q[rear]=item;
                rear=rear+1;
                System.out.println(rear-front);
            }
            if(choice=='D'){
                if(front==rear){
                System.out.println("-1 0");   
            }
            else{
                 System.out.println(q[front++]+" "+(rear-front));   
            }
            }
        }
}
}

    

