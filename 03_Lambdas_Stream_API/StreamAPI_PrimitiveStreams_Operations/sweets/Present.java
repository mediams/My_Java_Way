package sweets;

import mytasks.mylibrary.mysweetsshop.Sweet;

import java.util.Arrays;

public class Present {
    private Sweet[] sweets = new Sweet[10];
    private int lenghtCount;

    public Present(Sweet[] sweets) {
        this.sweets = sweets;
    }

    public Present() {
    }

    public Sweet[] getSweets() {
        return sweets;
    }

    public void setSweets(Sweet[] sweets) {
        this.sweets = sweets;
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + Arrays.toString(sweets) +
                '}';
    }
    // the method filters sweets by sugar weight inclusively
//    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
//
//        return null;
//    }

    //    // the method calculates total weight of the present
//    public double calculateTotalWeight() {
//	<write your code here>
//    }
//
    // the method that adds sweet to the present
    public void addSweet(Sweet sweet) {
        if (sweet == null) {
            return;
        }
        if (sweets.length <= lenghtCount) {
            sweets = Arrays.copyOf(sweets, sweets.length * 2);
        }
        sweets[lenghtCount++] = sweet;
    }
//
//    // the method returns copy of the Sweet[] array so that nobody could
//// modify state of the present without addSweet() method.
//// Also array shouldn’t contain null values.
//    public Sweet[] getSweets() {
//	<write your code here>
//    }

}
