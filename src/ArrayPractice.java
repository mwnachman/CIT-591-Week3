import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
		String[] friends = new String[5];
		friends[0] = "meredith";
		friends[1] = "carlo";
		friends[2] = "ham";
		friends[3] = "baby";
		friends[4] = "second dog 2";
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].length() > 10) {
				System.out.println(friends[i]);
			}
		}
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(1);
		myInts.add(2);
		System.out.println(myInts.size());
		for (Integer integer : myInts) {
			System.out.println(integer);
		}
	}

}
