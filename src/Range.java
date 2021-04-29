import java.util.HashSet;

public class Range implements NumberGroup {
	public boolean contains(int check) {
		for(int i = lo; i < hi; i++) {
			if(check == i) {
				return true;
			}
		}
		return false;
	}

	private int lo;
	private int hi;
	private HashSet<Integer> theRange;

	public Range(int lowerBound, int higherBound) {
		lo = lowerBound;
		hi = higherBound;
		for (int i = lo; i <= hi; i++) {
			theRange.add(i);
		}
	}
	
}
