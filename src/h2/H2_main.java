package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 35;
        int j = 52;
        int k = 77;
        int min, max;

        min = i;
        max = i;
        if (j < min) {
            min = j;
        } else if (j > max) {
            max = j;
        }
        if (k < min) {
            min = k;
        } else if (k > max) {
            max = k;
        }

//        System.out.println(min);
//        System.out.println(max);

    }
}
