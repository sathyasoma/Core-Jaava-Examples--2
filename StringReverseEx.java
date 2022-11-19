package com.cg.demos;

//Write a Java program to reverse words in a given string

public class StringReverseEx {

	 public static String WordsInReverse(String str1) {
		  StringBuilder sb = new StringBuilder(str1);
		  String StrRev = sb.reverse().toString();

		  String[] words = StrRev.split(" ");
		  StringBuilder reverse = new StringBuilder();
		  for (String tmp: words) {
		   sb = new StringBuilder(tmp);
		   reverse.append(sb.reverse() + " ");
		  }
		  reverse.deleteCharAt(reverse.length() - 1);
		  return reverse.toString();
		 }

		 public static void main(String[] args) {
		  String str1 = "Reverse words in a given string";
		  System.out.println("The given string is: " + str1);
		  System.out.println("The new string after reversed the words: " + WordsInReverse(str1));
		 }
}
