public class ArraySearchExample {
public static void main(String[] args) {
System.out.println("Akshara Anilkumar \n 23MCA009 \n 14-3-2024");
int[] array = { 1, 5, 9, 2, 4, 7 };
int target = 4;
boolean found = false;

for (int i = 0; i < array.length; i++) {
if (array[i] == target) {
found = true;
break;
}
}

if (found) {
System.out.println("Element " + target + " found in the array.");
} else {
System.out.println("Element " + target + " not found in the array.");
}
}
}
