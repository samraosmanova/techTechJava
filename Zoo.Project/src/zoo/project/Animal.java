package zoo.project;

/**
 *
 * @author samra
 */
public abstract class Animal {
    // how old the Animal is in months.

    private int age;

    // whether the Animal is Male (‘m’) or Female (‘f’).
    private char gender;

    // specifies the types of food that the Animal will eat. An array of strings
    private String[] eats;

    // specifies how healthy the animal is. It is a value between 0 and 10, with 10 being very healthy and 0 being dead.
    private int health;

    // specifies the average age that the Animal lives to in months.
    private int lifeExpectancy;

    public Animal(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public int getLifeExpectancy() {
        return this.lifeExpectancy;
    }

    /**
     * @param food
     * @return true if animal can eat food, false if can't
     */
    public boolean canEat(String food) {
        boolean can = true;
        for (String eat : this.eats) {
            can = eat.equals(food);
        }
        return can;
    }

    /**
     * @param food
     * @return true if animal can eat and eats food, false if don't
     */
    public boolean eat(String food) {
        if (!this.canEat(food)) {
            this.health++;
            return false;
        } else {
            return true;
        }
    }

    public void decreaseHealth() {
        this.health -= 2;
    }

    public void treat() {
    }

    public abstract void aMonthPasses();
}
