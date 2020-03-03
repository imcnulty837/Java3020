// Ian McNulty Problem 9 1/27/2020
class Ian_McNulty_AssignOne_Problem9
{
    public static void main(String[] args) {
        String license = "";
        int i = 1;
        while(i <= 7) {
            if (i <= 3) {
                int x = 65 + (int)(Math.random()*25);
                license += (char)x;
            }
            else if (i > 3) {
                int x = (int)(Math.random()*10);
                license += x;
            }
            i++;
        }
        System.out.println(license);
    }
}