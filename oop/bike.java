package oop;
public class bike {

    String mark;
    int hp;
    double engine;
    

    bike(String mark, int hp, double engine) {
        
        this.mark = mark;
        this.hp = hp;
        this.engine = engine;
    }

    void tiul() {
        System.out.println(this.mark + " is coming to tiul");
    }

    void notInClub() {
        System.out.println(this.mark + " stay home");
    }

}
