package com.blogging.java9;

public class TryWithResourceDemo {

    public static void main(String[] args) {
        MyResource myResource = new MyResource("My Resource");
        try(myResource; MyResource secondResource = new MyResource("Second Resource")) {
            myResource.displayMessage();
            secondResource.displayMessage();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
