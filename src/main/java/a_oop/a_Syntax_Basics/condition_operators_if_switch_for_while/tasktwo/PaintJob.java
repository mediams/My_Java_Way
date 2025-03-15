package a_oop.a_Syntax_Basics.condition_operators_if_switch_for_while.tasktwo;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); //→ should return -1 since the width parameter is invalid

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); //→ should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); //→ should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println("----------");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); //→ should return -1 since the width parameter is invalid

        System.out.println(getBucketCount(3.4, 2.1, 1.5)); //→ should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.

        System.out.println(getBucketCount(7.25, 4.3, 2.35)); //→ should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
        System.out.println("----------");
        System.out.println(getBucketCount(3.4, 1.5)); //→ should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

        System.out.println(getBucketCount(6.26, 2.2)); //→ should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

        System.out.println(getBucketCount(3.26, 0.75)); //→ should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double ceil = Math.ceil(((width * height) / areaPerBucket));

        return (int) ceil - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double ceil = Math.ceil(((width * height) / areaPerBucket));

        return (int) ceil;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double ceil = Math.ceil(((area) / areaPerBucket));

        return (int) ceil;

    }
}
