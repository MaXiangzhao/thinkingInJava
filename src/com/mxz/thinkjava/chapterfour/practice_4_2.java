package com.mxz.thinkjava.chapterfour;

public class practice_4_2 {
    public static void main(String[] args) {
        int num[] = new int[25];
        for (int i = 0; i < 25; i++)
            num[i] = (int) (Math.random() * 100);

        for (int j = 0; j <num.length-1; j++)
            if(num[j] > num[j+1])
                System.out.println("数 " + num[j] + " 大于后面的数 " +num[j + 1]);
            else if (num[j] < num[j + 1])
                System.out.println("数 " + num[j] + " 小于后面的数 " + num[j + 1]);
            else
                System.out.println("数 " + num[j] + " 等于后面的数 " + num[j + 1]);
    }
}
