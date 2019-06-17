import java.util.Arrays;

public class ArrayListImplementation {
	int[] array;

	ArrayListImplementation() {
		array = new int[0];
	}
	
	void add(int element) {
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[array.length] = element;
		array = newArray;
	}
	
	void add(int index, int element) {
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		for (int i = array.length; i > index; i--) {
			newArray[i] = newArray[i-1];
		}
		newArray[index] = element;
		array = newArray;
	}
	
	void removeAll() {
		int[] newArray = new int[0];
		array = newArray;
	}
	
	int size() {
		return array.length;
	}
	
	public static void main(String[] args) {
		ArrayListImplementation myArray = new ArrayListImplementation();
		for (int i = 0; i < myArray.array.length; i++) {
			System.out.println(myArray.array[i]);
		}
		myArray.add(5);
		myArray.add(7);
		myArray.add(9);
		myArray.add(11);
		myArray.add(13);
		myArray.add(15);
		for (int i = 0; i < myArray.array.length; i++) {
			System.out.println(myArray.array[i]);
		}
		myArray.add(2, 100);
		for (int i = 0; i < myArray.array.length; i++) {
			System.out.println(myArray.array[i]);
		}
		myArray.removeAll();
		for (int i = 0; i < myArray.array.length; i++) {
			System.out.println(myArray.array[i]);
		}
	}
}
