import Entity.Factory;
import Entity.SweetType;
import Entity.Sweets;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FactoryTest {

    @Test
    public void addSweets(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,23000, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,10,18),1.23,23000, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,23000, SweetType.WAFFLE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
    }

    @Test
    public void displaySweets(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,23000, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,10,18),1.23,23000, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,23000, SweetType.WAFFLE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);

        factory.displaySweets();
    }

    @Test
    public void displaySweetsByQuantityProduced(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,23000, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,10,18),1.23,26000, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,32000, SweetType.WAFFLE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);

        factory.displaySweetsByQuantityProduced();
    }

    @Test
    public void displaySweetsByProductionDateAndName(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,23000, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,9,13),1.23,26000, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,32000, SweetType.WAFFLE);
        Sweets sweets4 = new Sweets(4,"T", LocalDate.of(2023,8,19),0.69,54112, SweetType.BISQUITS);
        Sweets sweets5 = new Sweets(5,"Multihull", LocalDate.of(2023,7,22),0.4,1234576, SweetType.WAFFLE);
        Sweets sweets6 = new Sweets(6,"Svoge", LocalDate.of(2023,6,29),2.13,12324, SweetType.CHOCOLATE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
        factory.addSweets(sweets4);
        factory.addSweets(sweets5);
        factory.addSweets(sweets6);

        factory.displaySweetsByProductionDateAndName();
    }

    @Test
    public void displayChocolateSweets(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,23000, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,9,13),1.23,26000, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,32000, SweetType.WAFFLE);
        Sweets sweets4 = new Sweets(4,"T", LocalDate.of(2023,8,19),0.69,54112, SweetType.BISQUITS);
        Sweets sweets5 = new Sweets(5,"Multihull", LocalDate.of(2023,7,22),0.4,1234576, SweetType.WAFFLE);
        Sweets sweets6 = new Sweets(6,"Svoge", LocalDate.of(2023,6,29),2.13,12324, SweetType.CHOCOLATE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
        factory.addSweets(sweets4);
        factory.addSweets(sweets5);
        factory.addSweets(sweets6);

        factory.displayChocolateSweets();
    }

    @Test
    public void displaySweetsQuantityGreaterThan(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,230, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,9,13),1.23,198, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,320, SweetType.WAFFLE);
        Sweets sweets4 = new Sweets(4,"T", LocalDate.of(2023,8,19),0.69,54, SweetType.BISQUITS);
        Sweets sweets5 = new Sweets(5,"Multihull", LocalDate.of(2023,7,22),0.4,576, SweetType.WAFFLE);
        Sweets sweets6 = new Sweets(6,"Svoge", LocalDate.of(2023,6,29),2.13,123, SweetType.CHOCOLATE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
        factory.addSweets(sweets4);
        factory.addSweets(sweets5);
        factory.addSweets(sweets6);

        factory.displaySweetsQuantityGreaterThan(200);
    }

    @Test
    public void displaySweetsQuantityGreaterThan2(){
        Factory factory = new Factory();

        Sweets sweets = new Sweets(1,"Oreo", LocalDate.of(2023,10,18),1.23,230, SweetType.BISQUITS);
        Sweets sweets2 = new Sweets(2,"Milka", LocalDate.of(2023,9,13),1.23,198, SweetType.CHOCOLATE);
        Sweets sweets3 = new Sweets(3,"Hiper", LocalDate.of(2023,10,18),1.23,320, SweetType.WAFFLE);
        Sweets sweets4 = new Sweets(4,"T", LocalDate.of(2023,8,19),0.69,54, SweetType.BISQUITS);
        Sweets sweets5 = new Sweets(5,"Multihull", LocalDate.of(2023,7,22),0.4,576, SweetType.WAFFLE);
        Sweets sweets6 = new Sweets(6,"Svoge", LocalDate.of(2023,6,29),2.13,123, SweetType.CHOCOLATE);

        factory.addSweets(sweets);
        factory.addSweets(sweets2);
        factory.addSweets(sweets3);
        factory.addSweets(sweets4);
        factory.addSweets(sweets5);
        factory.addSweets(sweets6);

        factory.displaySweetsQuantityGreaterThan2();
    }
}
