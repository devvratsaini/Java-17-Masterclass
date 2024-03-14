package challanges;

public class EvenNumber {

    public static boolean isEvenNumber(int num) {
        return (num % 2) == 0;
    }

    public static void main(String[] args) {

        System.out.print("Even numbers are : ");

        int evenCount = 0, oddCount = 0;

        int counter = 4;
        while (counter < 20) {
            counter++;
            if (!isEvenNumber(counter)) {
                oddCount++;
                continue;
            } else {
                evenCount++;
                System.out.print(counter + " ");
            }
            if (evenCount == 5) {
                break;
            }
        }
        System.out.println("\n" + oddCount + " odd numbers and " + evenCount + " even numbers found.");
    }
}
