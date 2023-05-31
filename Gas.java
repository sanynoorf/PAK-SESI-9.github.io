import java.io.*;

public class Gas {
    public static void main(String[] args) {
        Console console = System.console();
        String jadiGak = console.readLine("Jadi Gak Main Nya: ");
        String jamBerapa = console.readLine("Jam Berapa: ");
        String siapSiap = console.readLine("Siap Siap OK: ");
        System.out.println("======KITA MAIN=====");
        System.out.println("Main : " +jadiGak);
        System.out.println("Jam Berapa : " + jamBerapa);
        System.out.println("Kamu Siap Siap : " + siapSiap);
    }
}

