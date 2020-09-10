package h3;

public class HomeWork {

    public void showDifference(){
        int i = 3;
        System.out.println("For the difference between i++ and i++, we start with the int 3");
        System.out.println("When we use ++i the number will first get one higher:" + ++i);
        System.out.println("When we use i++ we get the value first so the number will be the same:" + i++);
        System.out.println(" Next time we print it it will be higher " + i);
    }

    public void calculateJ(){
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);
    }

    public byte calculateBinary(){
        byte b1= 0b0111 + 0b100;
        return b1;
    }

    public int calculateTime(int currentTime, int leapedHours){
        int total = currentTime + leapedHours % 24;
        return total > 24 ? total - 24 : total;
    }

}
