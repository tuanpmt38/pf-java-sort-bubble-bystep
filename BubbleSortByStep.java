import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size:");
        size = scanner.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print("Enter element " + (i) + " arrNumber:");
            arrNumber[i] = scanner.nextInt();
        }

        System.out.println("Arr number input: ");
        for (int i = 0; i < arrNumber.length; i++)
            System.out.print(arrNumber[i] + " ");

        System.out.println("\n Before sort processing...");
        bubbleSort(arrNumber);
        for (int i = 0; i < arrNumber.length; i++)
            System.out.print(arrNumber[i]+ " ");
    }

    public static void bubbleSort(int[] number) {
        boolean needNextpass = true;
        for (int i = 1; i < number.length; i++) {
            needNextpass = false;
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + number[i] + " with " + number[i + 1]);
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    needNextpass = true;
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextpass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[j] + "\t");
            }
            System.out.println();
        }
    }
}
