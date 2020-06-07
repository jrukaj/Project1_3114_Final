import java.util.*;
import student.TestCase;

public class CommandParserTest extends TestCase {

	private CommandParser c;
	private ArrayList<ArrayList<String>> commands;
	
	public void setUp() {

		c = new CommandParser("test_commands.txt");
	}
	
	public void testParseCommand() {
		commands = c.parseCmd();
		assertEquals(2, commands.size());
		assertEquals("insert", commands.get(0).get(0));
		assertEquals("jon", commands.get(0).get(1));
		assertEquals("rukaj", commands.get(0).get(2));
		
		assertEquals("dumpsection", commands.get(1).get(0));
	}
	
	public void testParseLine() {
		ArrayList<String> list = c.parseLine(" insert Jon    Rukaj");
		assertEquals(3, list.size());
		assertEquals("insert", list.get(0));
		assertEquals("Jon", list.get(1));
		assertEquals("Rukaj", list.get(2));
		
		ArrayList<String> list2 = c.parseLine("    dumpsection      ");
		assertEquals(1, list2.size());
		assertEquals("dumpsection", list2.get(0));
		
		ArrayList<String> list3 = c.parseLine("score 50");
		assertEquals(2, list3.size());
		assertEquals("score", list3.get(0));
		assertEquals("50", list3.get(1));
	}
}
