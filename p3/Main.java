package p3;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        ArrayList<String> list = new ArrayList();

        long startTime=System.currentTimeMillis();
        System.out.println("start time: "+startTime);
        do {
                list.add("");
        }while(list.size()<500000);
        System.out.println(list.size());
        long endTime = System.currentTimeMillis();

        System.out.println("endtime: "+endTime);
        long timeElapsed = endTime - startTime;
        System.out.println("Arraylistadd time: "+ timeElapsed);
        System.out.println("--------------------");
        Linked();
    }
    public static void Linked (){
        long startTime=System.currentTimeMillis();
        System.out.println("start time: "+startTime);

        LinkedList<String> list1 = new LinkedList<String>() ;
        do {
            list1.add("");
        }while(list1.size()<500000);
        System.out.println(list1.size());
        long endTime = System.currentTimeMillis();

        System.out.println("endtime: "+endTime);
        long timeElapsed = endTime - startTime;
        System.out.println("Linkedlistadd time: "+ timeElapsed);
        
    }


}
