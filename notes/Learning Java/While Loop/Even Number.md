# Even Number

**Step 1 :**

```java
public class EvenNumber {

    public static boolean isEvenNumber(int num) {
        return (num % 2) == 0;
    }

    public static void main(String[] args) {

        System.out.print("Even numbers are : ");

        int counter = 5;
        while (counter <= 20) {
            if (isEvenNumber(counter)) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();
    }
}
```

- `continue` ends the current iteration and proceeds to the next one, without executing rest of the statements.

There is another possible alternative `while` block that can be used here :

```java
int counter = 4;
while (counter < 20) {
		counter++;
		if (!isEvenNumber(counter)) {
				continue;
		}
		System.out.print(counter + " ");
}
System.out.println();
```

You could also update the `counter` variable this way :

```java
if (!isEvenNumber(++counter))
```

This updates the counter variable and then passes its new value into the actual parameters.

**Step 2 :**

```java
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
        System.out.println("\n" + oddCount + " odd numbers and " 
								                + evenCount + " even numbers found.");
    }
}
```