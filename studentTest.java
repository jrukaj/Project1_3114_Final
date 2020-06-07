import student.TestCase;
/**
 * Tests the student class
 * @author jtr11
 *
 */
public class studentTest extends TestCase {

	private student s1;
	private student s2;
	
	/**
	 * Sets up test environment
	 */
	public void setUp() {
		s1 = new student("Jonathan", "Rukaj");
		s1.setScore(100);
		s2 = new student("Dilan", "Prasad");
		s2.setSection(2);
	}
	
	/**
	 * Tests the getName() method
	 */
	public void testGetName() {
		assertEquals("Jonathan Rukaj", s1.getName());
		assertEquals("Dilan Prasad", s2.getName());
	}
	
	/**
	 * Tests getFirst() and getLast() methods
	 */
	public void testGetFirstAndGetLast() {
		assertEquals("Jonathan", s1.getFirst());
		assertEquals("Rukaj", s1.getLast());
		
		assertEquals("Dilan", s2.getFirst());
		assertEquals("Prasad", s2.getLast());
	}
	
	/**
	 * Tests getScore() method
	 */
	public void testGetScore() {
		assertEquals(100, s1.getScore());
		assertEquals(0, s2.getScore());
	}
	
	/**
	 * Tests getSection() method
	 */
	public void testGetSection() {
		assertEquals(1, s1.getSection());
		assertEquals(2, s2.getSection());
	}
	
	/**
	 * Tests getId() method
	 */
	public void testGetId() {
		assertEquals(0, s1.getId());
		assertEquals(0, s2.getId());
		
		s1.setId(0010001);
		s2.setId(0020001);
		
		assertEquals(0010001, s1.getId());
		assertEquals(0020001, s2.getId());
	}

}
