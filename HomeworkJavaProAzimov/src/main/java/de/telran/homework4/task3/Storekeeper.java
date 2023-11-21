package de.telran.homework4.task3;

public class Storekeeper {
    void receiveGoods(){
        System.out.println("Storekeeper receives goods");
    }
    void releaseGoods (){
        System.out.println("Storekeeper releases goods");
    }

    void determineStorageLocation() {
        System.out.println("Storekeeper determines the place (cell) for storing the goods");
    }

    void createPickingTask() {
        System.out.println("Storekeeper creates a task for assembling goods from the warehouse.");
    }

    void createPlacementTask() {
        System.out.println("Storekeeper creates a task for placing goods in the warehouse.");
    }
}
