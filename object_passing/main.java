package object_passing;

public class main {

    public static void main(String[] args) {

        garage chelnovGarage = new garage();

        bike markoBike = new bike("Royal Enfield Meteor 350", "Blue");
        bike zhekaBike = new bike("Royal Enfield Meteor 350", "Black");

        if(-5>0) {
            garage.park4(markoBike);
        }else {
            garage.park3(zhekaBike);
        }
        

    }
    
}
