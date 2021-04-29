import java.util.List;

public class MultipleGroups implements NumberGroup{
	private List<NumberGroup> groupList;
	private int groupCount;
	public MultipleGroups(int a, int b, int c, int d, int e, int f) {
		//assumption made that there will be three Range objects
		groupList.add(new Range(a,b));
		groupList.add(new Range(c,d));
		groupList.add(new Range(e,f));
		groupCount = 3;
	}

	
	public boolean contains(int check) {
		for(int i = 0; i < groupCount; i++) {
			if(groupList.get(i).contains(check)) {
				return true;
			}
		}
		return false;
	}
	
}
