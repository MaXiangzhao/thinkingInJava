package com.mxz.thinkjava.chapterfour;

public class forEachString {
    public static void main(String[] args) {
        for (char c: "I love OVERWATCH".toCharArray()) {
            System.out.println(c + " ");
        }
    }
}
