package org.example;
import java.util.Date;
import java.util.Random;
public class Tickets {
    public void create_ticket(String ticket){
        Random rand = new Random();
        for (int i = 0; i < 6; i++){
            int num = rand.nextInt(9);
            ticket += num;
        }
    }
}
