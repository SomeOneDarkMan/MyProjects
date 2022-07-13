public class Cafari {
    public static int foo(int n,int m,int[]ene){
        if(n==0 & n==0||n>=0 && m==n){
            return 1;
        }
        if(m>n&n>=0){
            return 1;
        }
        if(m<0){
        if(ene[m*-1]>0){
            return ene[m*-1];
        }}
        else {
            if(ene[m]>0){
                return ene[m];
            }
        }

       int c;
        c = foo(n-1,m-1, ene) +  foo(n-1,m,ene);
        if (m<0)
        ene[m*-1]=c;
        else if(n<0&m<0) {
            ene[m*-1]=c;
        }else {
            ene[m]= c;

        }

        return c;
    }

    public static void main(String[] args) {
        int[] ene=new int[100];
       System.out.println( foo(100,50,ene));
    }
}
