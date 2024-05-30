package Excersice;

import java.util.logging.Logger;

public class Sample {
    Logger logger = Logger.getLogger(getClass().getName());
    public static void main(String[] args) {
        long startTime ,endTime;
        startTime = System.currentTimeMillis();
        System.out.println("Hello Murali");

        Sample obj = new Sample();
        obj.Reverse("Google");
        obj.ReverseStingBuilder("Google");
        endTime = System.currentTimeMillis();
        double time = (endTime-startTime)/1000.0;
        System.out.println("time : "+time);

    }
    public  void Reverse(String str){
        char[] StrChar = str.toCharArray();
        logger.info("Reverse Method");

        System.out.println("Input String: "+str);

        for(int i=StrChar.length-1;i>=0;i--){
            System.out.print(StrChar[i]);
        }
        System.out.println();
    }

    public void ReverseStingBuilder(String str){
        StringBuilder builder = new StringBuilder();
        logger.info("String Reverse using stringBuilder");

        char[] charStr = str.toCharArray();
        for(int i = charStr.length-1;i>=0;i--){
            builder.append(charStr[i]);
        }
        logger.info("Output Reverse String "+builder.toString());
    }
}
