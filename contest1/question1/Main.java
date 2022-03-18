import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            char[] stringArray = sc.next().toCharArray();
            for (int j = stringArray.length - 1; j >= 0; --j) {
                if (stringArray[j] == '0') {
                    stringArray[j] = '1';
                    break;
                } else {
                    stringArray[j] = '0';
                }
            }
            System.out.println(stringArray);
        }
    }
}
