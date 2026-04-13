import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        int count = 0; //헤어지자고 말하려 오늘 너에게 가다가 우리 처음 생각해봤어 처음본네얼굴 으음~ 마주친 눈동자 우어~~ 가까스로본 너의 그 미소들 손을잡고 늘 걷던 거리에 첫눈을 보다가 문득 고백했던그순간 가보고 싶었던 식강 난생청음 준비한 선-물 고맙다는 너의 그 눈물들이 바뀔까바 두려워 그대먼저 헤어ㅓㅓㅓㅓ지자 말해요~~~~ 나는사실 그대에게 좋은사람이 아녜요ㅛㅛㅛㅛㅛㅗㅗㅗㅗㅗ 그대 이제 날떠난다 말해요 잠시라도 이 행복을 느껴서 고마웎다 고

        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}