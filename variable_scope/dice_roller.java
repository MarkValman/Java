package variable_scope;

import java.util.Random;

public class dice_roller {

    Random imRandom;
    int number = 0;

    dice_roller(){
        imRandom = new Random();
        roll();
    }

        void roll() {
            number = imRandom.nextInt(6)+1;
            System.out.println(number);

    }
    
}
