package com.pratap.exceptions;

public class ExceptionHandlingRunner {

    public static void main(String[] args) {

        methodOne();
        System.out.println("main ended");
    }

    private static void methodOne() {
        methodTwo();
        System.out.println("methodOne ended");
    }

    private static void methodTwo() {
        try {
            String str = null;
            str.length();
            System.out.println("methodTwo ended");
        } catch (NullPointerException e){
            System.out.println("NPE");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
