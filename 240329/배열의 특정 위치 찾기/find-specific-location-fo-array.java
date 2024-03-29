import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for(int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        int sum = 0;
        int cnt = 0;
        double avg = 0.0d;
        
        for(int i = 1; i <= num.length; i++) {
            if(i %2 ==0) {
                sum += num[i-1];
            }
            if(i %3==0) {
                avg += num[i-1];
                cnt++;
            }
        }

        avg = (double) avg / cnt;

        System.out.println(sum + " " + String.format("%.1f", avg));
        sc.close();
    }
}