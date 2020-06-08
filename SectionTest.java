package Proj1;

public class SectionTest extends student.TestCase {
    
    private Section sec;
    
    public void setUp() {
        sec = new Section();
        
    }
    
    public void testSecNum() {
        sec.setSecNum(5);
        assertEquals(5, sec.getSecNum());
        
    }
    
    public void testSecId() {
        sec.setId(2);
        assertEquals(2, sec.getId());
    } 
    
    public void testInsert() {
        sec.insert(new Student("Orenthal", "James"));
        assertEquals("(Orenthal James)", sec.toString());
    }
    
    
}
