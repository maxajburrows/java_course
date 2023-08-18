package chapter12;

import java.util.regex.Pattern;


public class Regex {
    public static void main(String[]args){
        System.out.println(LetterChanges("Abcdefxyz"));
    }
    public static String LetterChanges(String str) {
        //System.out.println(str.charAt(0));
        for(int i=0; i<str.length(); i++){
            int numberRep = Character.getNumericValue(str.charAt(i));
            //int codePoint = Character.getNumericValue(numberRep);
            int newNum = numberRep + 1;
            char[] newLetter = Character.toChars(newNum);
            //System.out.println(str.charAt(i).Character.charValue());
            System.out.println(numberRep);
            //System.out.println(newNum);
            System.out.println(newLetter);
            //System.out.println(Character.toChars(100));
        }

        /*for (int i = 0; i < str.length() - 1; i++) {


        }*/

       return str;
    }
}
