import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] P = new int[N];
        int[] S = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            P[i] = Integer.parseInt(st.nextToken());
            S[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += (P[i]/2+S[i]);
            //System.out.println("sum=" + sum);
            if(sum <= B) {
                cnt++;
            } else {
                //sum += (P[i]/2+S[i]);
                //if( sum > B) {
                    break;
                //}
                //cnt++;
            }
            //System.out.println("sum=" + sum + ", cnt="+cnt);
        }
        System.out.println(cnt);
    }
}