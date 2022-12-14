package ru.mirea.lab8;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    int k = 2;
    int s = 8;
    int begin = (int) Math.pow(10, k - 1);
    int counter = 0;

    public void recursion() {
        if(begin == Math.pow(10, k)) {
            System.out.println(counter);
            return ;
        }

        int result = 0;
        String str = String.valueOf(begin);
        char[] arr = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(char ch : arr) {
            result = result + (int) ch;
        }

        if(result == s) {
            counter ++;
        }

        begin++;
        recursion();
    }

    public static void main(String[] args) {
        Task4 digitSum = new Task4();
        digitSum.recursion();
    }
}
