//Ian McNulty Assignment 4 Problem 7 2/26/2020
import java.util.Arrays;

class TestSeven{
    public static void main(String[] args) {
        MyString2 a = new MyString2("Welcome to Java");

        System.out.println("initial:        " + a.getWord());
        System.out.println("substring(6):   " + a.substring(6).getWord());
        System.out.println("toUpperCase():  " + a.toUpperCase().getWord());
        System.out.println("toChars():      " + Arrays.toString(a.toChars()));
        System.out.println("valueOf(false): " + MyString2.valueOf(false).getWord());
    }
}

class MyString2 {
    private char[] string;

    public MyString2(String s){
        string = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            string[i] = s.charAt(i);
        }
    }
    public static void main(String[] args) {
    }

    public MyString2 substring(int begin) {
        String temp = "";
        for (int i = begin; i < string.length; i++){
            temp += string[i];
        }
        return new MyString2(temp);
    }

    public MyString2 toUpperCase(){
        String temp = "";
        for (int i = 0; i < string.length; i++){
            if (string[i] >= 97 && string[i] <= 122)
                temp += (char)(string[i] - 32);
            else   
                temp += string[i];
        }
        return new MyString2(temp);
    }

    public char[] toChars(){
        return string;
    }

    public static MyString2 valueOf(boolean a){
        String temp = "";
        if (a)
            temp = "true";
        else
            temp = "false";
        return new MyString2(temp);
    }  

    public String getWord(){
        String temp = "";
        for (int i = 0; i < string.length; i++){
            temp += string[i];
        }
        return temp;
    }
}