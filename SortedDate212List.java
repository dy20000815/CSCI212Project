
public class SortedDate212List extends Date212List {
	public void add(Date212Node date) {
		if(date!=null) {
			this.last.next=date;
			this.length++;
			last=date;
		}
	}
}


