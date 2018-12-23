package cm2100guicw;

import java.util.Comparator;


/**
 * class encapsulating properties and methods of Drinks  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public class Sandwich extends MenuItem {
    
    private String filling;
    private Bread breadType;
    private static final int COSTOFBREAD = 100;
   
    public Sandwich(String name, int cost, String f, Bread b) {
        super(name, cost);
        this.filling = f;
        this.breadType = b;   
    }

    public String getFilling(){
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }
   
    public Bread getBreadType(){
        return breadType;
    }
    
    public void setBreadType(Bread breadType) {
        this.breadType = breadType;
    }    

    @Override
    public String toString() {
        return super.toString() + ", filling = " + filling + " on " + breadType + " bread";
    }

    
    @Override
    public int price(){
        return COSTOFBREAD + this.getUnitCost();
    }
    
    public static void main(String[] args) {
        Sandwich s1 = new Sandwich("BLT-W", 350,"Bacon+Lettuce+Tomato", Bread.WHITE);
        System.out.println(s1);
    }
    
    public static class SortSandwichesByName implements Comparator<Sandwich>{
    
        @Override
        public int compare(Sandwich s1, Sandwich s2){
        
            return s1.getName().compareTo(s2.getName());
            
        }
    
    }
    
    public static class SortSandwichesByPrice implements Comparator<Sandwich>{
    
        @Override
        public int compare(Sandwich s1, Sandwich s2){
        
            return s1.getUnitCost() - s2.getUnitCost();
        
        }
    
    }
    
}
