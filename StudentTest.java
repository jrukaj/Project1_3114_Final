package Proj1;

public class StudentTest extends student.TestCase {

    private Student s1;
    private Student s2;
    
    /**
     * Sets up test environment
     */
    public void setUp() {
        s1 = new Student("Jonathan", "Rukaj");
        s1.setScore(100);
        s2 = new Student("Dilan", "Prasad");
        s2.setSection(2);
    } 
    
    /**
     * Tests the getName() method
     */
    public void testGetName() {
        s2.setName("Jerry", "Seinfeld");
        assertEquals("Jonathan Rukaj", s1.getName());
        assertEquals("Jerry Seinfeld", s2.getName());
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
    
    public void testCompareTo() {
        assertEquals(-1, s1.compareTo(s2)); 
        assertEquals(1, s2.compareTo(s1));
        assertEquals(0, s1.compareTo(0));
    }
    
    public void testGetFullName() {
        assertEquals("DilanPrasad", s2.getFullName());
    }

}
