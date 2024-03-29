import java.io.*;
import java.util.*;

public class Main {
    static class Present {
        int price;          // 가격
        int deliveryFee;    // 배송비
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 학생들이 원하는 선물 리스트 초기화
        List<Present> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Present present = new Present();
            present.price = Integer.parseInt(st.nextToken());
            present.deliveryFee = Integer.parseInt(st.nextToken());
            list.add(present);
        }
        //br.close();

        // 선물 리스트 오름차순 정렬
        list.sort((Present o1, Present o2) -> {
            int presentSum1 = o1.price + o1.deliveryFee;
            int presentSum2 = o2.price + o2.deliveryFee;
            
            // 가격 + 배송비를 기준으로 오름차순 정렬
            if (presentSum1 != presentSum2) {
                return Integer.compare(presentSum1, presentSum2);
            } else { // 가격 + 배송비가 같은 경우 가격 기준으로 오름차순 정렬
                return Integer.compare(o1.price, o2.price);
            }
        });

        // 최대 선물 가능한 학생 수 구하기
        int result = presentCount(list, B);

        System.out.println(result);
        //bw.write(String.valueOf(result));
        //bw.flush();
        //bw.close();
    }

    private static int presentCount(List<Present> presentList, int B) {
        int sum = 0;    // 선물의 가격 + 배송비들의 총합
        int count = 0;  // 선물 가능한 학생 수 카운트

        // 선물 리스트 순회
        for (Present present : presentList) {
            // 현재 선물의 가격 + 배송비
            int presentCost = present.price + present.deliveryFee;
            
            if (sum + presentCost <= B) { // 예산보다 작은 경우
                sum += presentCost; // sum에 더하기
                count++; // 학생 수 증가
            } else { // 예산보다 큰 경우
                // 할인 쿠폰 사용 후 가격
                present.price /= 2;
                presentCost = present.price + present.deliveryFee;

                // 예산보다 작으면 count 증가
                if (sum + presentCost <= B) {
                    count++;
                }

                break;
            }
        }

        return count;
    }
}