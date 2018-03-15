package calculator;

import java.util.Random;

public class RandomGenerator {

        private Random random;

        public RandomGenerator(){
            this.random = new Random();
        }


    public int getSmallNUmber(){
        return random.nextInt(10);
    }

    public int getBigNumber(){
            return random.nextInt(100);
    }
}
