import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num  = new int[10];

        for(int i=0; i<10; i++) {
            num[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int i =0; i<num.length; i++) {
            if(i%2==0) {
                evenSum += num[i];
            } else {
                oddSum += num[i];
            }
        }

        System.out.println(Math.abs(evenSum - oddSum));

        sc.close();
    }
}