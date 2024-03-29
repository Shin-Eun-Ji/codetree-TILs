import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num[] = new int[100];
        int sum = 0;

        int i = 0;
        while(st.hasMoreTokens()) {
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int j = 0;
        for(j =0; j<i; j++) {
            if(num[j] == 0) {
                break;
            }
        }

        for(int k = j-1; k > j-4; k--) {
            sum += num[k];
        }

        System.out.println(sum);
    }
}