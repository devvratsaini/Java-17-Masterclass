# ArrayList

The important points about the Java ArrayList class are:

- Java ArrayList class can contain duplicate elements.
- Java ArrayList class maintains insertion order.
- Java ArrayList class is non synchronized.
- Java ArrayList allows random access because the array works on an index basis.
- In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
- We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
- Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.

![Untitled](ArrayList%20f9e6210cb66e4e91bb48718df6782863/Untitled.png)

**Syntax :**

```java
ArrayList<data_type> identifier = new ArrayList<>();
```

Here,

- `data_type` can be replaced by the desired Wrapper Class (in case of primitive data types) or Class objects.
- `identifier` can be replaced by any name you wish to give to the ArrayList variable.

**Sample Program :**

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Intro_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<>();
		
		// adding elements to ArrayList
		strList.add("Hello World!");
		strList.add("String 2's text");
		strList.add("haha");
		
		// inserting element at a specific location
		strList.add(1, "Text inserted in between");
		
		// checking if element is present in ArrayList 
		System.out.println("ArrayList contains 'Hello World!' ? : " + strList.contains("Hello World!"));
		
		// printing element at index 0
		System.out.println("\nElement at index 0 = " + strList.get(0));
		
		// finding index of element, if present
		System.out.println("\nIndex of haha = " + strList.indexOf("haha"));
		System.out.println("Index of HAHA = " + strList.indexOf("HAHA"));
		
		// removing an entry
		strList.remove("String 2's text");
		
		// printing size of ArrayList
		System.out.println("\nSize of ArrayList = " + strList.size());
		
		// printing all elements of ArrayList
		System.out.println("\nAll elements of ArrayList :");
		Iterator<String> itr = strList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		// clearing the entire ArrayList
		strList.clear();
	}
}
```