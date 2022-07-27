
    import java.util.Scanner;
    public class hw2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2], sum;
        System.out.println("Enter the data for matrix A:");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter A" + i + j + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the data for matrix B:");
        for (int k = 0; k < arr.length; k++) {

            for (int l = 0; l < arr.length; l++) {
                System.out.println("Enter B" + k + l + ":");
                arr[k][l] = sc.nextInt();
            }

        }
        System.out.println("The sum of matrix A and B is: ");
        for (int i = 0, k = 0; i < arr.length; i++, k++) {

            for (int j = 0, l = 0; j < arr.length; j++, l++) {
                sum = arr[i][j] + arr[k][l];
                System.out.print(sum + "\t");
            }
            System.out.println();
        }

    }
}
