package zoo.project;

/**
 * @author samra
 */
public class ZooProject {

    public static void main(String[] args) {
        Foodstore foodstore = new Foodstore();
        foodstore.addFood("hay", 5);
        foodstore.addFood("steak", 10);
        foodstore.addFood("fruit", 7);
        foodstore.addFood("celery", 4);
        foodstore.addFood("fish", 11);
        foodstore.addFood("ice cream", 5);
        
        System.out.println(foodstore.food);
    }
}
