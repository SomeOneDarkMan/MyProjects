package SimplWorkHome.LatinNubers;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LatinNubers {
    public static int romanToInt(String[] s){
        int i=0;
        int count=0;
        int llong= s.length;
        Map<String,Integer> mapRoman=new LinkedHashMap<>();
        mapRoman.put("I",1);
        mapRoman.put("V",5);
        mapRoman.put("X",10);
        mapRoman.put("L",50);
        mapRoman.put("C",100);
        mapRoman.put("D",500);
        mapRoman.put("M",1000);
 while (i<s.length-1){


     if(s.length==1){
        return count+=mapRoman.get(s[i]);
     }
     if (mapRoman.get(s[i])<=mapRoman.get(s[i+1])){
         int b=i;
         int sum=0;

         while (mapRoman.get(s[i])==mapRoman.get(s[b])){
             b++;
             sum+=mapRoman.get(s[i]);
             if(mapRoman.get(s[i])<mapRoman.get(s[b])){
                 count+=mapRoman.get(s[b])-sum;
             } else if(mapRoman.get(s[i])==mapRoman.get(s[b])){
                 count+=sum;
             }

             if(b+1==s.length){

                 return count;

             }


         }

     }


     }

     if(mapRoman.get(s[i])==mapRoman.get(s[i+1])){

     }

     if(mapRoman.get(s[i])>mapRoman.get(s[i+1])){
         int b=i;
         int sum=0;
         while (mapRoman.get(s[i])==mapRoman.get(s[b])){
             b++;
             sum+=mapRoman.get(s[i]);}
             if(mapRoman.get(s[i])<mapRoman.get(s[b])){
                 count=mapRoman.get(s[b])-sum;
             }

             if(b==s.length){
                 count+=sum;
             }




     i+=2;
 }




        return count;
    }
    public static void main(String[] args) {

        String masString;
        Scanner scanner=new Scanner(System.in);
        masString=scanner.nextLine();
        masString=masString.toUpperCase();
        String[] infoo=new String[masString.length()] ;

        for (int i=0;i<masString.length();i++){
            infoo[i]= String.valueOf(masString.charAt(i));

        }
       System.out.println (romanToInt(infoo));



    }
}
