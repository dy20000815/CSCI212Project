import java.awt.GridLayout;
import java.io.IOException;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Date212GUI {
	//set gui size and textarea
	public void DateGui() throws NumberFormatException, IOException {
		JFrame jf= new JFrame("Date212");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(50,50);
		jf.setLocation(30,30);
		jf.setLayout(new GridLayout( 1,2));
		
		JTextArea textArea1 = new JTextArea(10, 20);
	    textArea1.setEditable(false);
	    JScrollPane scrollPane1 = new JScrollPane(textArea1);
	    jf.getContentPane().add(scrollPane1);
	    displayUnsortedList( textArea1);
	    
	    JTextArea textArea2 = new JTextArea(10, 20);
	    textArea2.setEditable(false);
	    JScrollPane scrollPane2 = new JScrollPane(textArea2);
	    jf.getContentPane().add(scrollPane2);
	    displaySortedList(textArea2);
	    
	    
	    //visible
	    jf.pack();
	    jf.setVisible(true);
	}
	//read file and display an unsorted list
	public void displayUnsortedList(JTextArea ta) throws NumberFormatException, IOException {
		//read file
		String[] date = TextFileInput.returnStrArray("InputFile.txt");
		//add to list
		UnsortedDate212List udl= new UnsortedDate212List();
		for (int i=0;i<date.length;i++) {
			if(date[i]!=null){
				Date212 d=new Date212();
				d.setDate(date[i]);
				Date212Node n=new Date212Node(d);
				udl.add(n);
			}else {
				break;
			}
		}
		//display
		Date212Node node=udl.first.next;
		for(int a=0;a<udl.length;a++) {
			if(node!=null) {
				ta.append(node.data.toString()+"\n");
				node=node.next;
			}
		}
	}
	//read file and display an sorted list
	public void displaySortedList(JTextArea ta) throws NumberFormatException, IOException {
		//read file
		String[] date = TextFileInput.returnStrArray("InputFile.txt");
		//sort
		String temp=null;
		for(int j=0;j<date.length;j++) {
			if(date[j]==null) {
				break;
			}
			for(int i=0; i<date.length;i++) {
				if(date[i]==null) {
					break;
				}
				if(Integer.valueOf(date[j])<=Integer.valueOf(date[i])) {
					temp=date[j];
					date[j]=date[i];
					date[i]=temp;
				}
			}
		}
		//add to linked list
		SortedDate212List sdl= new SortedDate212List();
		for (int i=0;i<date.length;i++) {
			if(date[i]!=null){
				Date212 d=new Date212();
				d.setDate(date[i]);
				Date212Node n=new Date212Node(d);
				sdl.add(n);
			}else {
				break;
			}
		}
		//display
		Date212Node node=sdl.first.next;
		for(int a=0;a<sdl.length;a++) {
			if(node!=null) {
				ta.append(node.data.toString()+"\n");
				node=node.next;
			}
		}
	}
}
	