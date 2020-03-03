// Ian McNulty Assignment 3 Problem 5
class Test {
    public static void main(String[] args){
        Time x = new Time();
        Time y = new Time(555550000);
        Time z = new Time(5, 23, 55);

        System.out.println("Time object x created using Time(): " + x.getHour() + ":" + x.getMinute() + ":" + x.getSecond());
        System.out.println("Time object y created using Time(long): " + y.getHour() + ":" + y.getMinute() + ":" + y.getSecond());
        System.out.println("Time object z created using Time(int, int, int): " + z.getHour() + ":" + z.getMinute() + ":" + z.getSecond());
    }
}

class Time {
    private int hour;
    private int min;
    private int sec;
    
    Time() {
        setTime(System.currentTimeMillis());
    }
    
    Time(long a) {
        setTime(a);
    }
    
    Time(int a, int b, int c) {
        hour = a;
        min = b;
        sec = c; 
    }
    
    public static void main(String[] args) {
      
    }
    
    void setTime(long a) {
        hour = (int)((a / 3600000)%24);
        min = (int)((a / 60000)%60);
        sec = (int)((a / 1000)%60);
    }
    
    int getHour() { return hour; }
    int getMinute() { return min; }
    int getSecond() { return sec; }
  }