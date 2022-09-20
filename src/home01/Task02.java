package home01;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][]{{"0","1","2","3","4"},{"4","3","2","1","0"}}));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
