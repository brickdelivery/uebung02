package h3;

public class H3_main {
    public static void main(String[] args) {
        int i=140;
        int j =150;
        int k=-10;
        boolean a = i>j;
        boolean b = i>200;
        boolean c = j>100;

        if (a){
            if (b) {
                if (c) {
                    k=3;
                }  else k=2;
            } else if (!c) {
                k=1;
            }
        } else if (!b && !c) {
            k=4;
        }
        System.out.println(k);
    }
}
