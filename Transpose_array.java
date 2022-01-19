
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
       
        int b[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
