package utils;

import java.util.Random;

public class KeyUtil {
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number =  random.nextInt(1000)+ 1000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
    public static synchronized   Integer  inGenUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(1000)+1000;
        return  number;
    }
}
