package Proj1;

public class BSTTest extends student.TestCase {
    
    private BST tester;
    private Student testSub;
    private Student valerdictorian;

    public void setUp() {
        tester = new BST();
        
        testSub = new Student("Jerry", "Seinfeld");
        
        valerdictorian = new Student("Yo", "Mamma");
    }
    
    public void testInsert() {
        tester.insert(testSub);
        //assertFalse(tester.isEmpty());
        tester.insert(valerdictorian);
        tester.insert(valerdictorian);
        Student val = new Student("Yo", "Mamma");
        System.out.println(tester.toString());
        //System.out.println(tester.toString());
        
        String j = "hello";
        
        if (j.contains("ll")) {
            System.out.println("hi");
        }
        
    }
}
 