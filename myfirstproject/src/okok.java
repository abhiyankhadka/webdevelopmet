import java.util.Scanner;
public class okok {
    public static void main(String[] args) {
      
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int sum[][]=new int[2][2];
        
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number in matrix A :");
 
          for(int i=0;i<2;i++){
              for(int j=0;j<2;j++){
                 a[i][j]=sc.nextInt();

              }
      
            }
              System.out.println("enter the number in matrix B:");
              for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                   b[i][j]=sc.nextInt();
  
                }
  
            }
            System.out.println("the matrix A is:");
 
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                   System.out.print(a[i][j]+" ");
  
                }
                System.out.println();
              }
                System.out.println("the matrix b is:");
 
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                       System.out.print(b[i][j]+" ");
                    }
                    System.out.println();
                    }
                   
               
        
          
             
              System.out.println("sum of matrix :");
              for(int i=0;i<2;i++){
                for(int j=0;j<2;j++)
                {
                  sum[i][j]=a[i][j]+b[i][j];
                   System.out.print(sum[i][j] +"\t");

                }
                System.out.println();
              
              }

               

     
        }
      }
        
    



