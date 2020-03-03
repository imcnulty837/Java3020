// Ian McNulty Assignment 3 Problem 6
class Test{
    public static void main(String[] args){
        MyInteger x = new MyInteger(10);
        MyInteger y = new MyInteger(5);
        MyInteger z = new MyInteger(9);
        char[] a = {'1', '2', '3'};
        String b = "123";

        System.out.println("x is " + x.getValue());
        System.out.println("y is " + y.getValue());
        System.out.println("z is " + z.getValue());
        
        System.out.println("X even? using isEven() " + x.isEven());
        System.out.println("y even? using isEven(MyInteger) " + MyInteger.isEven(y));
        System.out.println("3 even? using isEven(int) " + MyInteger.isEven(3));

        System.out.println("X odd? using isOdd() " + x.isOdd());
        System.out.println("Z odd? using isOdd(MyInteger) " + MyInteger.isOdd(z));
        System.out.println("3 odd? using isOdd(int) " + MyInteger.isOdd(3));

        System.out.println("X prime? using isPrime() " + x.isPrime());
        System.out.println("y prime? using isPrime(MyInteger) " + MyInteger.isPrime(y));
        System.out.println("3 prime? using isPrime(int) " + MyInteger.isPrime(3));

        System.out.println("x == z? using equals(MyInteger) " + x.equals(z));
        System.out.println("y == 5? using equals(int) " + y.equals(5));

        System.out.println("String 123 is integer " + MyInteger.parseInt(b));
        System.out.println("Char[] = [1, 2, 3] is integer " + MyInteger.parseInt(a));
    }
}

class MyInteger{
    private int value;
    
    MyInteger(int a){
        value = a;
    }
    
    public static void main(String args[]){ 
      
    }
    
    boolean isEven(){
        if (value % 2 == 0)
            return true;
        else
            return false;
    }
    boolean isOdd(){
        if (value % 2 != 0)
            return true;
        else
            return false;
    }
    boolean isPrime(){
        for(int i = 2; i <= value/2; i++){
            if(value%i == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int a){
        if (a % 2 == 0)
            return true;
        else
            return false;
    }
    static boolean isOdd(int a){
        if (a % 2 != 0)
            return true;
        else
            return false;
    }
    static boolean isPrime(int a){
        for(int i = 2; i <= a/2; i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(MyInteger a){
        if (a.getValue() % 2 == 0)
            return true;
        else
            return false;
    }
    static boolean isOdd(MyInteger a){
        if (a.getValue() % 2 != 0)
            return true;
        else
            return false;
    }
    static boolean isPrime(MyInteger a){
        for(int i = 2; i <= a.getValue()/2; i++){
            if(a.getValue()%i == 0)
                return false;
        }
        return true;
    }

    boolean equals(int a){
        if (value == a)
            return true;
        else
            return false;
    }
    boolean equals(MyInteger a){
        if (value == a.getValue())
            return true;
        else
            return false;
    }
    
    static int parseInt(char[] arr){
        int[] temp = new int[arr.length];
        
        int i = 0;
        for (char value: arr){
            switch(value){
                case '0':
                    temp[i] += 0;
                    break;
                case '1':
                    temp[i] += 1;
                    break;
                case '2':
                    temp[i] += 2;
                    break;
                case '3':
                    temp[i] += 3;
                    break;
                case '4':
                    temp[i] += 4;
                    break;
                case '5':
                    temp[i] += 5;
                    break;
                case '6':
                    temp[i] += 6;
                    break;
                case '7':
                    temp[i] += 7;
                    break;
                case '8':
                    temp[i] += 8;
                    break;
                case '9':
                    temp[i] += 9;
                    break;
            }
            i++;
        }

        int parse = 0;
        for (int j = 1; j <= temp.length; j++){
            parse += (temp[j -1] * (Math.pow(10, temp.length - j)));
        }

        return parse;
    }
    static int parseInt(String a){
        int[] temp = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++){
            char value = a.charAt(i);
            switch(value){
                case '0':
                    temp[i] += 0;
                    break;
                case '1':
                    temp[i] += 1;
                    break;
                case '2':
                    temp[i] += 2;
                    break;
                case '3':
                    temp[i] += 3;
                    break;
                case '4':
                    temp[i] += 4;
                    break;
                case '5':
                    temp[i] += 5;
                    break;
                case '6':
                    temp[i] += 6;
                    break;
                case '7':
                    temp[i] += 7;
                    break;
                case '8':
                    temp[i] += 8;
                    break;
                case '9':
                    temp[i] += 9;
                    break;
            }        
        }

        int parse = 0;
        for (int j = 1; j <= temp.length; j++){
            parse += (temp[j -1] * (Math.pow(10, temp.length - j)));
        }

        return parse;
    }

    int getValue(){ return value; }
  }
  