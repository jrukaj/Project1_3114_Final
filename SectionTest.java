package Proj1;

public class SectionTest extends student.TestCase {
    
    private Section sec;
    
    public void setUp() {
        sec = new Section();
        
    }
    
    public void testMethods() {
        sec.insert(new Student("James", "Bond"));
        sec.insert(new Student("Orenthal", "James"));
        System.out.println(sec.toString());
    }
    
    
}
