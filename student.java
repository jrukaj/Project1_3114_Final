

public class student {
    


    private int score = 0;
    private String first;
    private String last;
    private int section = 1;
    private int id;
    
    /**
     * student constructor
     * @param initScore
     * @param first
     * @param last
     */
    student(String first, String last) {
        this.first = first;
        this.last = last;
    }
    
    /**
     * Sets the name of the student 
     * @param first
     * @param last
     */
    public void setName(String first, String last) {
        this.first = first;
        this.last = last;
    }
    
    /**
     * Sets student's score
     * @param scoreParam
     */
    public void setScore(int scoreParam) {
        this.score = scoreParam;
    }
    
    /**
     * Gets the student's first and last name
     * @return string representing name
     */
    public String getName() {
        return this.first + " " + this.last;
    }
    
    /**
     * Gets the student's first name
     * @return string representing first name
     */
    public String getFirst() {
    	return this.first;
    }
    
    /**
     * Gets the students last name
     * @return last name of the student
     */
    public String getLast() {
    	return this.last;
    }
    
    /**
     * Returns the student's score
     * @return score of the student
     */
    public int getScore() {
        return this.score;
    }
    
    /**
     * Gets the student's id
     * @return int representing their id
     */
    public int getId() {
    	return this.id;
    }
    
    /**
     * Sets the student's id
     * @param id
     */
    public void setId(int id) {
    	this.id = id;
    }
    
    /**
     * Gets the section number of the student
     * @return int representing student's section number
     */
    public int getSection() {
    	return section;
    }
    
    /**
     * Sets section number
     * @param num
     */
    public void setSection(int num) {
    	section = num;
    }
    
    /**
     * Compares the scores of two given students, returning -1 if it is greater, and 1 if it
     * is less than or equal to
     * @param element
     * @return 1 if this student's score is less than or equal to the others
     */
    public int compareTo(student element) {
        // TODO Auto-generated method stub
        if (this.getScore() > element.getScore()) {
            return -1;
        } 
        else {
            return 1;
        }
    }
}
