package Lab7;

public class Main {
public static void main(String args[]) {
Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
Double[] array2 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
Character[] array3 = {'A','B','C','D','E','F'};

System.out.print("Printing Integer Reversed Array: ");
printArray(array1);
System.out.print("Printing Double Reversed Array: ");
printArray(array2);
System.out.print("Printing Character Reversed Array: ");
printArray(array3);
}

public static <E> void printArray(E[] array) {
	System.out.print("[");
	for(int i=array.length-1;i>=0;i--) {
		if(i==0) {
			System.out.println(array[i]+"]");
		}
		else {
			System.out.print(array[i]+",");
		}
	}
}
}


