import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        int a,b ;

        Scanner input = new Scanner(System.in);

        System.out.println("Ay Seçiniz: (Ocak-1 Aralık-12 olacak şekilde 1 ile 12 arasında");
        a = input.nextInt();
        b = input.nextInt();

        if (a == 1) {
            if (b < 22) {
                System.out.println("Oğlak Burcusunuz.");
            } else if (b > 21) {
                System.out.println("Kova Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 2) {
            if (b < 20) {
                System.out.println("Kova Burcusunuz.");
            } else if (b > 19) {
                System.out.println("Balık Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 3) {
            if (b < 21) {
                System.out.println("Balık Burcusunuz.");
            } else if (b > 20) {
                System.out.println("Koç Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 4) {
            if (b < 21) {
                System.out.println("Koç Burcusunuz.");
            } else if (b > 20) {
                System.out.println("Boğa Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 5) {
            if (b < 21) {
                System.out.println("Boğa Burcusunuz.");
            } else if (b > 21) {
                System.out.println("İkizler Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 6) {
            if (b < 23) {
                System.out.println("İkizler Burcusunuz.");
            } else if (b > 22) {
                System.out.println("Yengeç Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 7) {
            if (b < 23) {
                System.out.println("Yengeç Burcusunuz.");
            } else if (b > 22) {
                System.out.println("Aslan Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 8) {
            if (b < 23) {
                System.out.println("Aslan Burcusunuz.");
            } else if (b > 22) {
                System.out.println("Başak Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 9) {
            if (b < 23) {
                System.out.println("Başak Burcusunuz.");
            } else if (b > 22) {
                System.out.println("Terazi Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 10) {
            if (b < 23) {
                System.out.println("Terazi Burcusunuz.");
            } else if (b > 22) {
                System.out.println("Akrep Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 11) {
            if (b < 22) {
                System.out.println("Akrep Burcusunuz.");
            } else if (b > 21) {
                System.out.println("Yay Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else if (a == 12) {
            if (b < 22) {
                System.out.println("Yay Burcusunuz.");
            } else if (b > 21) {
                System.out.println("Oğlak Burcusunuz.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız. Tekrar Deneyiniz.");
            }
        }else{
            System.out.println("Hatalı veri girişi, tekrar deneyiniz...");
        }
    }

    }

