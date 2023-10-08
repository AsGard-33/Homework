package de.ait.homework;

public class StringProcessor {
        public String concatenate(String str1, String str2) {
            return str1 + str2;
        }

        public int getLength(String str) {
            return str.length();
        }

        public String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public boolean isPalindrome(String str) {
            String reversed = reverse(str);
            return str.equals(reversed);
        }



}
