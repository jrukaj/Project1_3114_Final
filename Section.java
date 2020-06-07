import java.util.*;

/**
 * Section class
 * @author Jonathan Rukaj
 *
 */
public class Section {

	private Proj1BST tree;
	private int secNum = 1;
	private int id;
	
	private boolean flag1 = true;
	private boolean flag2 = false;
	private boolean flag3 = false;
	
	/**
	 * Section constructor
	 */
	public Section() {
		tree = new Proj1BST();
	}
	
	public ArrayList<ArrayList<String>> getSection(ArrayList<ArrayList<String>> list) {
		ArrayList<ArrayList<String>> secList = new ArrayList<ArrayList<String>>();
		for (ArrayList<String> strList: list) {
			if (strList.get(0).equals("section") && strList.get(1).equals("1")) {
				flag1 = true;
				flag2 = false;
				flag3 = false;
			}
			
			else if (strList.get(0).equals("section") && strList.get(1).equals("2")) {
				flag1 = false;
				flag2 = true;
				flag3 = false;
			}
			
			else if (strList.get(0).equals("section") && strList.get(1).equals("3")) {
				flag1 = false;
				flag2 = false;
				flag3 = true;
			}
			secList.add(strList);
			// use boolean flags to determine what section we are in
			// ie, when flag1 is true, all following commands are to be put in section 1
			
			// not sure 
		}
		
		return secList;
	}
}
