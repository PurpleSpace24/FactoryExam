package Entity;

import java.util.*;

public class Factory implements Ffunc{

    private List<Sweets> sweetsList;
    private Set<Sweets> sweetsSet;
    private Queue<Sweets> prQueueSweets;

    public Factory() {
        this.sweetsList = new ArrayList<>();
        this.sweetsSet = new HashSet<>();
        this.prQueueSweets = new PriorityQueue<>();
    }

    public List<Sweets> getSweetsList() {
        return sweetsList;
    }

    public void setSweetsList(List<Sweets> sweetsList) {
        this.sweetsList = sweetsList;
    }

    public Set<Sweets> getSweetsSet() {
        return sweetsSet;
    }

    public void setSweetsSet(Set<Sweets> sweetsSet) {
        this.sweetsSet = sweetsSet;
    }

    public Queue<Sweets> getPrQueueSweets() {
        return prQueueSweets;
    }

    public void setPrQueueSweets(Queue<Sweets> prQueueSweets) {
        this.prQueueSweets = prQueueSweets;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "sweetsList=" + sweetsList +
                ", sweetsSet=" + sweetsSet +
                ", priorityQueueSweets=" + prQueueSweets +
                '}';
    }

    public void addSweets(Sweets sweets){
        sweetsList.add(sweets);
        //sweetsSet.add(sweets);
        //prQueueSweets.add(sweets);
    }

    public void displaySweets(){
        sweetsList.forEach(System.out::println);
    }

    public void displaySweetsByQuantityProduced(){
        sweetsList.stream().sorted(((sweets, sweets1) -> sweets1.getProducedQuantity().compareTo(sweets.getProducedQuantity()))).forEach(sweets ->
                System.out.println("RegNumber: " + sweets.getRegNumber() + "   Name: " + sweets.getName() + "   Produced Quantity: " + sweets.getProducedQuantity()));
    }

    public void displaySweetsByProductionDateAndName(){
        sweetsList.stream().sorted(Sweets.sweetsProductionDate.thenComparing(Sweets.sweetsName)).forEach(sweets ->
                System.out.println("RegNumber: " + sweets.getRegNumber() + "   Production Date: " + sweets.getProductionDate() + "   Name: " + sweets.getName()));
    }

    public void displayChocolateSweets(){
        sweetsList.stream().filter(sweets -> sweets.getSweetsType().equals(SweetType.CHOCOLATE)).forEach(System.out::println);
    }

    // I
    public void displaySweetsQuantityGreaterThan(int quantity){
        sweetsList.stream().filter(sweets -> sweets.getProducedQuantity() > quantity).forEach(System.out::println);
    }

    // II
    public void displaySweetsQuantityGreaterThan2(){
        sweetsList.stream().filter(sweets -> sweets.getProducedQuantity() > 200).forEach(System.out::println);
    }

    public void displaySweetsByProductionPriceToLow() {
        sweetsList.stream().sorted(((sweets, sweets1) -> sweets1.getProductionPrice().compareTo(sweets.getProductionPrice()))).forEach(System.out::println);
    }

    public void displaySweetsBySweetType() {
        sweetsList.stream().sorted(((sweets, sweets1) -> sweets.getSweetsType().getN().compareTo(sweets1.getSweetsType().getN()))).forEach(sweets ->
                System.out.println("Name: " + sweets.getName() + "   SweetType: " + sweets.getSweetsType()));
    }

}
