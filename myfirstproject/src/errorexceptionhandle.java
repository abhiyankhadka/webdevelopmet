import java.util.Scanner;

public class errorexceptionhandle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numerator");
        int num=sc.nextInt();
        System.out.println("enter the denominator");
        int deno=sc.nextInt();
        System.out.println("enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("hello");
        try{
        System.out.println(num/deno);//throw new ArithmeticException 
        System.out.println(arr[5]);
        System.out.println("just a test");
        String s1=null;
        System.out.println(s1.length());
        String s="ak";
        int e=Integer.valueOf(s);
        }
        catch(ArithmeticException e){
        System.out.println("denominator cannot be zero");
        }catch(Exception e){
        System.out.println("okok");
        }
    }
}






