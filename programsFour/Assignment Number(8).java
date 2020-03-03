//Ian McNulty Assignment 4 Problem 8 2/26/2020

class TestEight{
    public static void main(String[] args) {
        MyStringBuilder2 a = new MyStringBuilder2("Welcome to Java!");
        MyStringBuilder2 b = new MyStringBuilder2(" Welcome to Python!");

        System.out.println("initial a:          " + a.getWord());
        System.out.println("initial b:          " + b.getWord());
        System.out.println("a.append(b):        " + a.append(b).getWord());
        System.out.println("new a:              " + a.getWord());
        System.out.println("a.toLowerCase():    " + a.toLowerCase().getWord());
        System.out.println("a.substring(4, 16): " + a.substring(4, 16).getWord());
    }
}

class MyStringBuilder2 {
    private char[] string;
    private int size, capacity;

    public MyStringBuilder2(String s){
        size = s.length();
        string = new char[size];
        for (int i = 0; i < size; i++){
            string[i] = s.charAt(i);
        }
    }

    public static void main(String[] args) {
        
    }

    public MyStringBuilder2 append(MyStringBuilder2 s){
        String temp = "";
        for(int i = 0; i < size; i++){
            temp += string[i];
        }
        for(int i = 0; i < s.length(); i++){
            temp += s.charAt(i);
        }

        size += s.length();
        string = new char[size];
        for(int i = 0; i < temp.length(); i++){
            string[i] = temp.charAt(i);
        }
        return new MyStringBuilder2(temp);
    }

    public int length(){ return size; }
    public char charAt(int i){ return string[i]; }

    public MyStringBuilder2 toLowerCase(){
        String temp = "";
        for (int i = 0; i < size; i++){
            if (string[i] >= 65 && string[i] <= 90)
                temp += (char)(string[i] + 32);
            else
                temp += string[i];
        }
        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 substring(int b, int e){
        String temp = "";
        for (int i = b; i < e; i++){
            temp += string[i];
        }
        return new MyStringBuilder2(temp);
    }

    public String getWord(){
        String temp = "";
        for (int i = 0; i < size; i++){
            temp += string[i];
        }
        return temp;
    }
}