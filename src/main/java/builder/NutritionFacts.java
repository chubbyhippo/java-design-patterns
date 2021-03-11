package builder;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    public static class Builder {

        private int servingSize = 0;
        private int servings = 0;
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;

        public Builder() {
        }
        public Builder servingSize(int val) {
            servingSize = val;
            return this;
        }
        public Builder servings(int val) {
            servingSize = val;
            return this;
        }
        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
    }
}

class BuildIt {
    public static void main(String[] args) {
        new NutritionFacts.Builder().servingSize(2).servings(1).calories(2).fat(3).carbohydrate(5).build();

    }
}
