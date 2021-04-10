package edu.cscc;

public class Surname {
    private String name;
    private int rank;
    private int count;
    private double proportion;

    //Constructor
    public Surname(String name, int rank, int count, double proportion){
        setName(name);
        setRank(rank);
        setCount(count);
        setProportion(proportion);
    }
    // Accessors
    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getCount() {
        return count;
    }

    public double getProportion() {
        return proportion;
    }
    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }
}