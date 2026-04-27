import java.util.Scanner;

public class check_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("\nNegative number in the array :  ");
        for (int num : array) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nPositive number in the array : ");
        for (int num : array) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nZero number in the array : ");
        for (int num : array) {
            if (num == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
