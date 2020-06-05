import java.util.*;
import java.io.*;

/**
 * Parses commands, storing them in an array to be used for further evaluation.
 * @author Jonathan Rukaj (jrukaj)
 * @author Dilan Prasad
 *
 */
public class Commandmanager1<E> {
	

	private File file;
	private ArrayList<ArrayList<String>> commands;
	private Scanner scan;
	private Proj1BST tree;
	/**
	 * CmdProcessor constructor
	 */
	public Commandmanager1() {
		// nothing to initialize
	}
	
	/**
	 * CmdProcessor 
	 * @param filename: name of the file
	 */
	public Commandmanager1(String filename) {
		try {
			file = new File(filename);
			scan = new Scanner(file);
		}
		catch (Exception e) {
			System.out.println("The file you are trying to open does not exist bröther.\n");
			e.printStackTrace();
			System.exit(0);
		}
		tree = new Proj1BST();
		commands = new ArrayList<ArrayList<String>>();
	}
	
	/**
	 * Scans through the input file, adding commands to an ArrayList
	 * @return list with commands
	 */
	public ArrayList<ArrayList<String>> parseCmd(){
		// not taking the last line bc of the while loop
		// String line = null;
		while (scan.hasNextLine()) {
			// line = scan.nextLine();
			commands.add(parseLine(scan.nextLine()));
			// scan.nextLine();		
		}
		scan.close();
		return commands;
	}
	
	/**
	 * Parses through an individual line, adding command and 
	 * parameters to a list.
	 * @param line
	 * @return list, with command as the first value and 
	 * 		the following values being the parameters
	 */
	public ArrayList<String> parseLine(String line) {
		ArrayList<String> list = new ArrayList<String>();
		// Add strings on the line to an array, then add to the ArrayList
		String[] splitted = line.trim().split("\\s+");
		for (String string: splitted) {
			list.add(string);
		}
		return list;
	}
	
	/**
	 * Process the commands, writing correct output
	 * @param list
	 */
	public void processCmd(ArrayList<ArrayList<String>> list) {
		
	}
	
}
