/*
 *****
  ****
   ***
    **
     *
*/

import java.util.Scanner;
class Right_Down_Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++)
                System.out.print(" ");
            for(int k=i;k<=n;k++)
                System.out.print("*");
            System.out.println();
        }

    }
}