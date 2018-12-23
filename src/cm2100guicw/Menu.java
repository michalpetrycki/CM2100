package cm2100guicw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * class encapsulating properties and methods of a Menu used in CM2100 GUI
 * Coding Coursework 
 * Was not required in Part 1
 * added here for convenience for use in GUI Sandwich Shop app for storing 
 * Food and Drink that can be added to an Order
 *
 * @author david
 */

/* Menu.java, edited by Michal Petrycki
 *Coursework Part 1 – due 14 December 2019 */ 
public class Menu {

    private ArrayList<MenuItem> items;
    private String menuName;

    public Menu(String name) {
        this.menuName = name;
        this.items = new ArrayList<>();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getNumItemsInMenu() {
        return items.size();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public MenuItem getMenuItem(int i) {
        return items.get(i);
    }

    public void addMenuItem(MenuItem m) {
        items.add(m);
    }

    public void addMenuItem(MenuItem m, String image) {
        m.setImageFileName(image);
        items.add(m);
    }

    public String getMenuAsString() {
        String rs = "";
        for (MenuItem m : items) {
            rs += m.toString() + "\n";
        }
        return rs;
    }

    @Override
    public String toString() {
        String str = getMenuAsString();
        return str;
    }

    public void sortItemsByTitle() {
        Collections.sort(items);
    }

    public void readFromFile(File f) {
        try {
            Scanner s = new Scanner(f);
            // For each Item
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(",");
                String type = parts[0];
                String name = parts[1];
                int unit = Integer.parseInt(parts[2]);
                // content then depends on type
                if (type.equals("SANDWICH")) {
                    Bread bread = Bread.valueOf(parts[3]);
                    String filling = parts[4];
                    String imageFileName = parts[5];
                    Sandwich item = new Sandwich(name, unit, filling, bread);
                    item.setImageFileName(imageFileName);
                    this.addMenuItem(item);
                } else if (type.equals("SIDE")) {
                    //Line not needed
                    //System.out.println(parts.length);
                    String sauce = parts[3];
                    String imageFileName = parts[4];
                    Side item = new Side(name, unit, sauce);
                    item.setImageFileName(imageFileName);
                    this.addMenuItem(item);
                } else if (type.equals("DRINK")) {
                    boolean alcoholic = Boolean.parseBoolean(parts[3]);
                    String imageFileName = parts[4];
                    Drink item = new Drink(name, unit, alcoholic);
                    item.setImageFileName(imageFileName);
                    this.addMenuItem(item);
                }
                //System.out.println(items.size() + " " + items);
            }
            System.out.println("Data Loaded successfully.");
            s.close();
        } catch (FileNotFoundException ex) {
            System.out.println("En error has occured.");
            System.out.println(ex.toString());
        }

    }

    public void sortItemsByPrice() {
        items.sort(new MenuItem.PriceComparator());
    }

    /* A method to save menu list in file specified by parameter */
    public void saveToFile(File f) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            for (MenuItem m : items) {
                String line = "";
                if (m instanceof Sandwich) {
                    line += "SANDWICH,"
                            + m.getName() + ","
                            + m.getUnitCost() + ","
                            + ((Sandwich) m).getBreadType() + ","
                            + ((Sandwich) m).getFilling() + "," 
                            + ((Sandwich) m).getImageFileName();
                } else if (m instanceof Side) {
                    line += "SIDE,"
                            + m.getName() + ","
                            + m.getUnitCost() + ","
                            + ((Side) m).getSauce() + ","
                            + ((Side) m).getImageFileName();
                } else if (m instanceof Drink) {
                    line += "DRINK,"
                            + m.getName() + ","
                            + m.getUnitCost() + ","
                            + ((Drink) m).hasAlcohol() + ","
                            + ((Drink) m).getImageFileName();
                }
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
        }
    }

    /* Simple test file */
    public static void main(String[] args) {
        Menu m = new Menu("Test Menu");
        m.fillMenuWithSomeItems();
        m.saveToFile(new File("menu.csv"));
        m.readFromFile(new File("menu.csv"));
        System.out.println(m);
    }

    public void fillMenuWithSomeItems() {
        //addMenuItem can take just a MenuItem e.g.
        addMenuItem(new Drink("Cola", 112, false));
        //or a MenuItem and a String holding thr name of an image file 
        addMenuItem(new Drink("Water", 150, false), "water.jpg");
        addMenuItem(new Drink("Beer", 400, true), "beer.jpg");
        addMenuItem(new Drink("OrangeJuice", 200, false), "oj.jpg");
        addMenuItem(new Drink("Sprite",120,false));
        addMenuItem(new Drink("Coffee",140,false));
        addMenuItem(new Drink("Gin Tonic",240,true));
        addMenuItem(new Side("Chips", 300), "chips.jpg"); // default Side with no sauce
        addMenuItem(new Side("Chips", 300, "tomato sauce"), "chips.jpg");
        addMenuItem(new Side("Salad", 250), "salad.jpg"); // default Side with no sauce
        addMenuItem(new Side("Salad", 250, "dressing"), "salad.jpg");
        addMenuItem(new Side("Onion Rings", 330));
        addMenuItem(new Side("Pinto Beans", 240, "salsa"));
        addMenuItem(new Side("Garlic Bread", 310, "butter"));
        addMenuItem(new Sandwich("BLT-W", 450, "Bacon+Lettuce+Tomato", Bread.WHITE), "BLT.jpg");
        addMenuItem(new Sandwich("Club", 650, "Chicken+Bacon+Lettuce+Egg", Bread.WHOLEMEAL), "club.jpg");
        addMenuItem(new Sandwich("Tuna", 400, "Tuna+Sweetcorn", Bread.WHITE), "tuna.jpg");
        addMenuItem(new Sandwich("Grilled Chicken", 600, "Bacon+Cheddar+Tomatoes", Bread.RYE));
        addMenuItem(new Sandwich("Black Angus Club", 540, "RoastBeef+Bacon+Onion", Bread.WHOLEMEAL));
        addMenuItem(new Sandwich("Spicy Southwest Chicken", 480, "Chicken+Guacamole+Relish", Bread.PITA));
    }

}
