interface MealPlan {
    String getName();
}

class VegetarianMeal implements MealPlan {
    public String getName() {
        return "Veg Meal";
    }
}

class Meal<T extends MealPlan> {
    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void display() {
        System.out.println(meal.getName());
    }
}

public class MealPlanSystem {
    public static void main(String[] args) {

        Meal<VegetarianMeal> m = new Meal<>(new VegetarianMeal());

        m.display();
    }
}