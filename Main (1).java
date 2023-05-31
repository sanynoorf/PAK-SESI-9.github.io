import java.io.*;;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        int bil = Integer.parseInt(console.readLine("Masukkan Bilangan: "));
        int result = tes(bil);
        System.out.printf("%d %d", bil, result);
    }

    public static int tes(int a) {
        if (a == 1) {
            return a;
        } else {
            return a * tes(a - 1);
        }
    }
}
