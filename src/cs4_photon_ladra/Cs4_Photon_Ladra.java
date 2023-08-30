package cs4_photon_ladra;
public class Cs4_Photon_Ladra {

    public static void main(String[] args) {
        String object1 = "mouse";
        String color1 = "black";
        int price1 = 300;

        String object2 = "phone";
        String color2 = "gray";
        int price2 = 10000;

        String object3 = "watch";
        String color3 = "blue";
        int price3 = 280;

        System.out.println("Object 1");
        System.out.println("Object name: " + object1);
        System.out.println("Color: " + color1);
        System.out.println("Price: " + price1 + "\n");

        System.out.println("Object 2");
        System.out.println("Object name: " + object2);
        System.out.println("Color: " + color2);
        System.out.println("Price: " + price2 + "\n");

        System.out.println("Object 3");
        System.out.println("Object name: " + object3);
        System.out.println("Color: " + color3);
        System.out.println("Price: " + price3 + "\n");
        
        boolean verify1, verify2;
        int difference = price2 - price1;
        int quotient = price2/price3;
        
        if (price1 < price3){
            verify1 = true;
        }
        else {
            verify1 = false;
        }
        
        if ((price1+price2+price3) < 11500) {
            verify2 = true;
        }
        else {
            verify2 = false;
        }
        
        System.out.println("Is the watch more expensive than the mouse: " + verify1); //operation: comparison
        System.out.println("\nHow much more expensive is the phone compared to the mouse? " + difference); //operation: subtraction
        System.out.println("\nIs the total price of all objects less than 11500 pesos? " + verify2);   //operation: comparison
        System.out.println("\nHow many watch is a phone worth? " + quotient);    //operation: division
    }
    
}
