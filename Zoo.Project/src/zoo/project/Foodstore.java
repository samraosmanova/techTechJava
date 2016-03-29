package zoo.project;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author samra
 */
public class Foodstore {

    public Map<String,Integer> food;

    public Foodstore() {
        this.food = new HashMap();
    }
    
    /**
     * 
     * @param nameOfFood
     * @param quantity 
     */
    public void addFood(String nameOfFood, int quantity){
        food.put(nameOfFood, quantity);
    }

    /**
     * 
     * @param nameOfFood 
     */
    public void takeFood(String nameOfFood) {
        food.replace(nameOfFood, food.get(nameOfFood) - 1);
    }
}
