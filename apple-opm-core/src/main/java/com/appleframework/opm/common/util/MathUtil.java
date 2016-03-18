package com.appleframework.opm.common.util;

public class MathUtil {
    public static int randomCount(int min, int max) {
        return (int) (min + Math.random()*(max-min));
    }
    
    public static boolean isZero(Number number) {
        if(number == null) {
            return true;
        }
        return number.doubleValue()==0;
    }
    
    public static void main(String[] args) {
        System.out.println(isZero(0));
        System.out.println(isZero(null));
        System.out.println(isZero(0.0));
        System.out.println(isZero(0.01));
    }
}
