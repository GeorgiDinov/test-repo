package com.georgidinov;

public class Main {

    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        String test1 = "Test";
        String test2 = new String(test1);
        System.out.println("Test1 hashCode = " + test1.hashCode());
        System.out.println("Test2 hashCode = " + test2.hashCode());
        System.out.println("Equal with == " + areEqualWithDoubleAssignOperator(test1, test2));
        System.out.println("Equal with equals() " + areEqualWithEqualsMethod(test1, test2));
    }

    private static boolean areEqualWithDoubleAssignOperator(String a, String b) {
        return a == b;
    }

    private static boolean areEqualWithEqualsMethod(String a, String b) {
        return a.equals(b);
    }

}
