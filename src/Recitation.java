
public class Recitation {

	public static void main(String[] args) {
		int ROWS = 5;
		int COLUMNS = 8;
		
		int[][] values = new int[ROWS][COLUMNS];
		
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
					values[i][j] = 1;
				} 
			}
		}
		
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				System.out.print(values[i][j]);
			}
			System.out.println("");
		}
		
		int[] values2 = new int[5];
		for (int i = 0; i < 5; i++) {
			values2[i] = i;
		}
		int total = 0;
		for (int value : values2) { 
			total += value; 
		}
		System.out.println(total);
		
		int[] values3 = new int[5];
		for (int i = 0; i < 5; i++) {
			values3[i] = i + 2;
		}
		total = 0;
		int counter = 0;
		for (int value : values3) {
			if (counter > 0) {
				total += value;
			}
			counter++;
			System.out.println(total);
		}
		
		int target = 4;
		counter = 0;
		for (int value : values3) {
			if (value == target) { 
				System.out.println("YAY " + counter);
			}
			counter++;
		}
		
	}
	
}
