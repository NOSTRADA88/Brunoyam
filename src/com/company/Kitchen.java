package com.company;

public class Kitchen {
    protected int spoons;
    protected int plates;
    protected int mugs;
    public Kitchen(int spoons, int plates, int mugs){
        this.spoons = spoons;
        this.plates = plates;
        this.mugs = mugs;
    }
    int spoonWasTaken;
    public void getSpoons (int spoon){
        if ((spoons > 0) && (spoons - spoon >= 0)) {
            spoonWasTaken = spoon;
            spoons -= spoon;
            System.out.println("You took " + spoon + " spoon(s)"+ ". Spoons left " + spoons);
        } else if (spoons - spoon <= 0) {
            System.out.println("You took a lot! Spoons available: " + spoons + " \nYou took: " + spoon);
        } else System.out.println("Spoons over, sorry");
    }
    int plateWasTaken;
    public void getPlates(int plate){
        if ((plates > 0) && (plates - plate >= 0)) {
            plateWasTaken = plate;
            plates -= plate;
            System.out.println("You took " + plate + " plate(s)" + ". Plates left " + plates);
        } else if (plates - plate <= 0) {
            System.out.println("You took a lot! Plates available: " + plates + " \nYou took: " + plate );
        } else System.out.println("Plates over, sorry");
    }
    int mugWasTaken;
    public void getMugs(int mug){
        if ((mugs > 0) && (mugs - mug >= 0)) {
            mugWasTaken = mug;
            mugs -= mug;
            System.out.println("You took " + mug + " mug(s)" +  ". Mugs left " + mugs);
        } else if (mugs - mug <= 0) {
            System.out.println("You took a lot! Mugs available: " + mugs + " \nYou took: " + mugs );
        } else System.out.println("Mugs over, sorry");
    }
    public void getSpoonsBack() {
        spoons += spoonWasTaken;
        System.out.println("You returned " + spoonWasTaken + " Spoon(s) " + "\nTotal number: " + spoons);
    }
    public void getPlatesBack() {
        plates += plateWasTaken;
        System.out.println("You returned " + plateWasTaken + " Plate(s) " + "\nTotal number: " + plates);
    }
    public void getMugsBack() {
        mugs += mugWasTaken;
        System.out.println("You returned " + plateWasTaken + " Mug(s) " + "\nTotal number: " + mugs);
    }
}
