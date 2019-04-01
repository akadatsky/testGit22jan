package com.akadatsky;

public class DmytroMartynov {
    String nameOfBurger;
    int massOfBurger;

    public int getMassOfBurger() {
        return massOfBurger;
    }

    public void setMassOfBurger(int massOfBurger) {
        this.massOfBurger = massOfBurger;
    }

    public void setNameOfBurger(String nameOfBurger) {
        this.nameOfBurger = nameOfBurger;
    }

    public String getNameOfBurger() {
        return nameOfBurger;
    }

    public void createBurger(int size){
        System.out.println("Wanted size of burger: ?" + size);
    }
    public void eatBurger(){
       massOfBurger = 0;
    }

}
