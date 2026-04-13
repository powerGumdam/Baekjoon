import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int hap = 0;
        int hapsezegop = 0;

        for (int i = 1; i <= n; i++) {
            hap += i;
        }

        for (int i = 1; i <= n; i++) {
            hapsezegop += i * i * i;
        }
        System.out.println(hap);
        System.out.println(hap * hap);
        System.out.println(hapsezegop);
        
    }
}