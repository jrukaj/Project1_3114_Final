import java.util.*;

/**
 * Section class
 * @author Jonathan Rukaj
 *
 */
public class Section<T> {

	private BST tree;
	private static int secNum = 1;
	private int id;
	
	private boolean insertCmd = false;
	private boolean searchCmd = false;
	
	
	/**
	 * Section constructor
	 */
	public Section() {
		tree = new BST();
	}
	
	
	
	/**
	 * Gets the section number
	 * @return integer representing the section number
	 */
	public int getSectionNumer() {
		return secNum;
	}
	
	public void execute(ArrayList<ArrayList<String>> list) {
		for (ArrayList<String> cmd: list) {
			switch (cmd.get(0).toLowerCase()) {
			
			case "section":
				secNum = Integer.parseInt(cmd.get(1));
				break;
				
				
			case "insert":
				String first = cmd.get(1);
				String last = cmd.get(2);
				Student newStu = new Student(first, last);
				if (tree.find(newStu) != null) {
					System.out.println(first + " " + last + " " + "is already in section " + Integer.toString(secNum));
				}
				else {
				    tree.insert(newStu);
				    System.out.println(first + " " + last + " " + "inserted");
				}
				insertCmd = true;
				break;
				
				
			case "search":
				if (cmd.size() == 3) {
					String firstName = cmd.get(1);
					String lastName = cmd.get(2);
					if (tree.find(new Student(firstName, lastName)) == null) {
						System.out.println("Search failed. Student " + firstName + " " + lastName
								+ " does not exist in section " + Integer.toString(secNum));
					}
					else {
						Student temp = (Student) tree.find(new Student(firstName, lastName));
						System.out.println(temp.getFullName() + ", " + Integer.toString(temp.getScore()));
					}
					
					//TO DO: search by one name
				}
				searchCmd = true;
				break;
				
				
			case "score":
				if (searchCmd || insertCmd) {
					
				}
				break;
				
			
			case "remove":
				
				insertCmd = false;
				searchCmd = false;
				break;
				
			
			case "removesection":
				// set tree root to null
				insertCmd = false;
				searchCmd = false;
				break;
				
				
			case "dumpsection":
				// print each node, each student record, and size of BST
				break;
				
				
			case "grade":
				// assign grades based on table and report how many studnts
				// in each grade level
				insertCmd = false;
				searchCmd = false;
				break;
				
				
			case "findpair":
				insertCmd = false;
				searchCmd = false;
				break;
				
			}
		}
	}
	
	public BST getTree() {
		return tree;
	}
	
	public void insertScore(T x, int score) {
        tree.updateScore((Comparable)x, score);
	}
}
