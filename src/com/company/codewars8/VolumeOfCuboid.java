package com.company.codewars8;

//Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid. Write a function to help Bob with this calculation.
public class VolumeOfCuboid {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        if (length <= 0 || width <= 0 || height <=0) return 0;
        return length * width * height;
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        if(length > 0 && width > 0 && height > 0){
            return length*width*height;
        }
        return 0;
    }
