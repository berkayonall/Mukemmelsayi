import java.util.Scanner;
public class Mukemmelsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        int a =input.nextInt();
        int b ;
        int toplam =0 ;

        for (int i =1;i<a;i++){
            if (a%i==0){
                toplam=toplam+i;

            }


        }
        if (toplam==a){
            System.out.println("A sayısı mükemmel bir sayıdır");
        } else if (toplam !=a){
            System.out.println("A sayısı mükemmel bir sayı değildir");

        }
        System.out.println(toplam);





    }
}
