import java.util.Arrays;

public class String10 {

    public static void main(String[] args) {
        double[] data = new double[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = i * i;
        }
        System.out.println(Arrays.toString(data));
    }

}
