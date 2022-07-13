package SimplWorkHome.LatinNubers;
/*
* находит самое частое совпадение в страке префикса тут были еще какие-то фишки но они остались не доделанными
* главное на latecode проходил задание,только некоторые тесты не проходил
* буду учиться писать нормальные алгаритмы и учиться строить их 31.03.2022
*
*
*
*
* */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class simplesurch {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }

        String sum = "";
        for(int i=1;i<strs.length;i++){
            if(strs[i]==""){
                break;


            }
            int count;
            int c=0;
            String s = "";

            int str1=strs[i].length();
            int str2=strs[i-1].length();
            if(str1<str2){
                count=str1;
            }else {count=str2;}

            if(sum==""){

                    boolean bbb=true;
                while (bbb)

                {
                    if(c<count){
                    if (strs[i].charAt(c)== strs[i-1].charAt(c)){

                    sum=sum+strs[i].charAt(c);c++;}else {
                    bbb=false;
                }
                }else {bbb=false;}
                }

            }
            if(sum!=""){
                for (int k=0;k<sum.length();k++){

                    if (sum.charAt(k)!=strs[i].charAt(k)){
                            sum="";
                       sum =s;
                           break;

                    }
                    s +=sum.charAt(k);

                }

            } if(sum==""){return "2";}
            count=0;
            c=0;
            s="";


        }

        return sum;
    }

    public static void main(String[] args) {

        String [] strs = {"flower","flow","floight"};



        System.out.println(longestCommonPrefix(strs));
        Scanner scanner=new Scanner(System.in);


    }
}
