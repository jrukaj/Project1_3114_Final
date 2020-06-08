import org.junit.Test;
import java.util.*;

import student.TestCase;

public class SectionTest extends TestCase {

	private Section sec;
	public void setUp() {
		sec = new Section();
	}
	
	public void testInsert() {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> cmd = new ArrayList<String>();
		
		cmd.add("insert");
		cmd.add("Jon");
		cmd.add("Doe");
		list.add(cmd);
		
		sec.execute(list);
		
		assertEquals(1, sec.getTree().getSize());
		
		sec.execute(list);
		assertEquals(1, sec.getTree().getSize());
	}
	
	public void testSection() {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("section");
		s.add("2");
		list.add(s);
		
		sec.execute(list);
		
		assertEquals(2, sec.getSectionNumer());
	}
	
	public void testSearch() {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> t = new ArrayList<String>();
		
		s.add("insert");
		s.add("Jon");
		s.add("Doe");
		
		t.add("search");
		t.add("Jon");
		t.add("Doe");
		
		list.add(s);
		list.add(t);
		
		sec.execute(list);
		
	}
	
	//public void testSearchOneName() {
		//ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		//ArrayList<String> s = new ArrayList<String>();
		
		
	//}

}
