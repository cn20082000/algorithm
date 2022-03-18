import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[1000];
            for (int j = 0; j < k; ++j) {
                arr[j] = sc.nextInt();
            }
            boolean isEnd = true;
            for (int j = 0; j < k; ++j) {
                if (arr[k - j - 1] < n - j) {
                    ++arr[k - j - 1];
                    for (int l = k - j; l < k; ++l) {
                        arr[l] = arr[k - j - 1] + l - k + j + 1;
                    }
                    isEnd = false;
                    break;
                }
            }
            if (isEnd) {
                for (int j = 0; j < k; ++j) {
                    arr[j] = j + 1;
                }
            }
            for (int j = 0; j < k; ++j) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
