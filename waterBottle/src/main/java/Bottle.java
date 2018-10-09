
//Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.

public class Bottle {

    private int volume;

    public Bottle() {
        this.volume = 100;
    }


    public int getVolume() {
        return this.volume;
    }


    public int reduceVolume() {
        return this.volume  -= 10;
    }

    public int emptyVolume() {
        return this.volume = 0;
    }

    public int fillVolume() {
        return this.volume = 100;
    }
}
