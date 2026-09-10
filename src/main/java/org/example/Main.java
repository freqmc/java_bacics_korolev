package org.example;
import java.util.Date;
import java.util.ArrayList;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        String tickets1 = new String();

        //String
        Date start1 = new Date();
        for (int i = 1; i < 1000000; i++){
            if (is_lucky(i)){
                String ticket1 = String.format("%06d", i);
                tickets1 += ticket1;
            }
        }
        Date end1 = new Date();
        long time1 = end1.getTime() - start1.getTime();


        //StringBuffer
        StringBuffer tickets2 = new StringBuffer();
        Date start2 = new Date();
        for (int i = 1; i < 10000; i++){
            if (is_lucky(i)){
                String ticket2 = String.format("%06d", i);
                tickets2.append(ticket2);
            }
        }
        Date end2 = new Date();
        long time2 = end2.getTime() - start2.getTime();


        //StringBuilder
        StringBuilder tickets3 = new StringBuilder();
        Date start3 = new Date();
        for (int i = 1; i < 10000; i++){
            if (is_lucky(i)){
                String ticket3 = String.format("%06d", i);
                tickets3.append(ticket3);
            }
        }
        Date end3 = new Date();
        long time3 = end3.getTime() - start3.getTime();
        System.out.println("счастливых билетов всего " + tickets3.length()/6);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    public static boolean is_lucky(int num){
        Date date = new Date();
        int n1 = num / 10000;
        int n2 = (num / 10000) % 10;
        int n3 = (num / 1000) % 10;
        int n4 = (num / 100) % 10;
        int n5 = (num / 10) % 10;
        int n6 = num % 10;
        return ((n1+n2+n3) == (n4+n5+n6));
    }
}