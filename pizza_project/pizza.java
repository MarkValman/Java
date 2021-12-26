package pizza_project;

public class pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    pizza(String bread, String sauce, String cheese, String topping){
        
        //it must here, another way sysout = "null"
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    pizza(String bread, String sauce, String cheese){
        
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
   
    pizza(String bread, String sauce){
        
        this.bread = bread;
        this.sauce = sauce;
    }

    pizza(String bread){
        
        this.bread = bread;        
    }

    pizza(){
        
    }

}
