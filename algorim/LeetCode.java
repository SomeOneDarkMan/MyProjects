package algorim;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {

        public static List swapPairs(List head,int c,int size) {
            int i=c;

            if(size== 1){
                return head ;
            }
            if (c== size){
                return head;
            }
            int first=(int)head.get(i-1);
            int second=(int)head.get(i);
            if(first<second&c!=size){
                head.add(first,second);
                head.add(second,first);




            }
            i++;
            swapPairs(head,i,size-1);
            return head;

        }

    public static void main(String[] args) {
        List<Integer>h=new ArrayList<>();
        for(int i=0;i<3;i++)
        h.add(i);
        h=swapPairs(h,1, h.size());
        for( int i=0;i< h.size();i++){
            System.out.println(h.get(i));
        }
    }

}
