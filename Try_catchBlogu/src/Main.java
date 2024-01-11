import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner sinifimizi tanimlayalim
        Scanner input = new Scanner(System.in);

        //Bir dizi tanimlayalim
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Dizi indeksi giriniz: ");
        int index = input.nextInt();

        //try-catch bloklari icerisinde hata yakalamya calisalim
        try {
            System.out.println("Dizinin " + index + ". elemanı: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin boyutunu aştınız!");
            System.out.println(e.toString());
        }finally {
            input.close();
        }
    }
}