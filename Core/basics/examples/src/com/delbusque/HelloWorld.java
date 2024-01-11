package com.delbusque;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(reverse("! dlroW olleH"));
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder string = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            string.append(chars[i]);
        }
        return string.toString();
    }
}
