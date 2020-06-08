package Proj1;

import java.util.ArrayList;

public class Section<T> {

    public BST tree;
    private int secNum = 1;
    private int id;
    
    private boolean flag1 = true;
    private boolean flag2 = false;
    private boolean flag3 = false;
    
    /**
     * Section constructor  
     */ 
    public Section() {  
        tree = new BST();
    } 
     
    public void insert(T x) { 
        tree.insert((Comparable)x);  
    } 
    
    public void insertScore(T x, int score) {
        tree.updateScore((Comparable)x, score);
    }
    
    public String toString() {
        return tree.toString();
    } 
    

    
    public void setSecNum(int val) {
        this.secNum = val;
    }
    
    public int getSecNum() {
        return this.secNum;
    }
    
    public void setId(int val) {
        this.id = val;
    }
    
    public int getId() {
        return this.id;
    }
}
