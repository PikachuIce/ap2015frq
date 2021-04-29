import java.util.HashSet;

public class DiverseArray {

	public DiverseArray() {
		// TODO Auto-generated constructor stub
	}

	public static int arraySum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public static int[] rowSums(int[][] arr2D) {
		int[] result = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			result[i] = arraySum(arr2D[i]);
		}
		return result;
	}

	public static boolean isDiverse(int[][] arr2D) {
		HashSet<Integer> checker = new HashSet<Integer>();
		int[] array = rowSums(arr2D);
		boolean result = true;
		for(int i = 0; i < array.length; i++) {
			int init = checker.size();
			checker.add(array[i]);
			if(checker.size() == init) {
				result = false;
				break;
			}
		}
		return result;
	}
}
