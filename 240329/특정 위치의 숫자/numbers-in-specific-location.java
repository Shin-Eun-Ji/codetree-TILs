import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i =0; i<10; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(num[2]+num[4]+num[9]);
    }
}