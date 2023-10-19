import Entity.Factory;
import Entity.SweetType;
import Entity.Sweets;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,230, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,9,13),2.42,198, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),3.21,320, SweetType.WAFFLE);
        Sweets sweets4 = new Sweets(4,"T", LocalDate.of(2023,8,19),0.69,54, SweetType.BISQUITS);
        Sweets sweets5 = new Sweets(5,"Multihull", LocalDate.of(2023,7,22),0.4,576, SweetType.WAFFLE);
        Sweets sweets6 = new Sweets(6,"Svoge", LocalDate.of(2023,6,29),2.13,123, SweetType.CHOCOLATE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
        factory.addSweets(sweets4);
        factory.addSweets(sweets5);
        factory.addSweets(sweets6);

        System.out.println("Display sweets: ");
        factory.displaySweets();
        System.out.println("Display sweets by quantity produced: ");
        factory.displaySweetsByQuantityProduced();
        System.out.println("Display sweets by production date and name: ");
        factory.displaySweetsByProductionDateAndName();
        System.out.println("Display only chocolate sweets : ");
        factory.displayChocolateSweets();
        System.out.println("Display sweets with a quantity greater than 200 : ");
        factory.displaySweetsQuantityGreaterThan2();
        System.out.println("Display sweets by sweet type : ");
        factory.displaySweetsBySweetType();
        System.out.println("Display sweets by production price to low: ");
        factory.displaySweetsByProductionPriceToLow();




    }
}
