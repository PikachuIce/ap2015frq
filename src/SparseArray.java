import java.util.ArrayList;
import java.util.List;

public class SparseArray {
	private int numRows;
	private int numCols;
	
	private List<SparseArrayEntry> entries;
	public SparseArray() {
		entries = new ArrayList<SparseArrayEntry>();
	}
	
	public int getNumRows() {
		return numRows;
	}
	public int getNumCols() {
		return numCols;
	}

	public int getValueAt(int row, int col) {
		return entries.get(0).getValue();
	}
	// issues encountered when attempting to write code to remove column
}
