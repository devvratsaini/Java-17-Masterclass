public class While_Intro {

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.print(j);
            j++;
        }
        System.out.println();

        // do-while loop
        j = 1;
        boolean isReady = false;
        do {
            if (j > 5) {
                break;
            }
            System.out.print(j);
            j++;
            isReady = (j > 0);
        } while (isReady);
        System.out.println();

        // demonstrating the fact that do-while loop gets executed at least once
        do {
            System.out.println(j);
        } while(false);
    }
}
