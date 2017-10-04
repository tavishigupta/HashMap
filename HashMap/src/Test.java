/**
 * This class tests the different cases for the hashmap.
 *
 * @author Tavishi Gupta */

public class Test {
	public static void main(String[] args) {
		int size = 8;
		Map<Character, Integer> test = new Map<Character, Integer>(size);
		test.set('a', 1);
		test.set('b', 2);
		test.set('c', 3);
		test.set('d', 4);
		System.out.println(test.get('a'));
		System.out.println(test.set('a', 2));
		System.out.println(test.get('a'));
		System.out.println(test.load());
		test.delete('b');
		System.out.println(test.get('l'));
		System.out.println(test.delete('l'));
		System.out.println(test.load());
	}
}
