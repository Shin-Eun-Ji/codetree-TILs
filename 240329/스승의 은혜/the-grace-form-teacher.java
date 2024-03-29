import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        Gift[] gifts = new Gift[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            gifts[i] = new Gift(P, S);
        }

        Arrays.sort(gifts); // 가격 기준으로 선물 정렬

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if(gifts[i].shipping > B) 
                break;
            if (gifts[i].price <= B) {
                B -= gifts[i].price; // 예산에서 선물 가격 차감
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }

    static class Gift implements Comparable<Gift> {
        int price;
        int shipping;

        public Gift(int price, int shipping) {
            this.price = price;
            this.shipping = shipping;
        }

        // 가격을 기준으로 오름차순 정렬
        @Override
        public int compareTo(Gift other) {
            return Integer.compare(this.price, other.price);
        }
    }
}