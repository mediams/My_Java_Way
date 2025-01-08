package mytasks.mylibrary.mysweetsshop;

public abstract class Sweet {
    private String name;
    private double weight; //is a weight of the specific sweet in kilograms
    private double sugarWeight; //sugarWeight is a weight of sugar in this sweet in kilograms.

    public Sweet(String name, double weight, double sugarWeight) {
        this.name = name;
        this.weight = weight;
        this.sugarWeight = sugarWeight;
    }
}
