package com.blogging.java11;

import java.util.Arrays;

public class NestMatesDemo {

    public static void main(String[] args) {
        boolean areNestmates = ParentClass.class.isNestmateOf(ParentClass.InnerClass.class);
        System.out.println("ParentClass and InnerClass are nest mates? - " + areNestmates);
        boolean isSameNestHost = ParentClass.class.getNestHost() == ParentClass.class.getNestHost();
        System.out.println("ParentClass and InnerClass have same nest host? - " + isSameNestHost);
        Class<?>[] nestMembers = ParentClass.class.getNestMembers();
        System.out.println("Nest members of ParentClass are: ");
        Arrays.stream(nestMembers).forEach(clazz -> System.out.println(clazz.getCanonicalName()));
    }
}
