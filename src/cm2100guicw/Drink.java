package cm2100guicw;

import java.util.Comparator;

/**
 * class encapsulating properties and methods of Drinks  
 * used in CM2100 GUI Coding Coursework
 * @author david
 */
public class Drink extends MenuItem{
    
    private boolean alcohol;

    public Drink(String name, int cost, boolean alcohol) {
        super(name, cost);
        this.alcohol = alcohol;
    }

    public boolean hasAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }


    @Override
    public String toString() {
        String str = super.toString();
        
        if(alcohol) str += " [Alcohol]";
        return str;
    }
    
    @Override
    public int price(){
        if(alcohol){
            return this.getUnitCost() + 100;
        }
        else return this.getUnitCost();
    }
    
    public static void main(String[] args) {
        Drink d1 = new Drink("Cola", 50, false);
        System.out.println(d1);
        Drink d2 = new Drink("Beer", 250, true);
        System.out.println(d2);
    }
    
    
    public static class SortDrinksByName implements Comparator<Drink>{
    
        @Override
        public int compare(Drink d1, Drink d2){
        
            return d1.getName().compareTo(d2.getName());
            
        }
    
    }
    
    public static class SortDrinksByPrice implements Comparator<Drink>{
    
        @Override
        public int compare(Drink d1, Drink d2){
        
            return d1.getUnitCost() - d2.getUnitCost();
        
        }
    
    }
    
}


