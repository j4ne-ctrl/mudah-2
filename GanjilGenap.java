package LtihanUKL;
import java.util.Scanner;

import com.ibm.security.jgss.mech.krb5.s;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============= PROGRAM GANJIL GENAP =============");

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah angka genap.");
        } else {
            System.out.println(angka + " adalah angka ganjil.");
        }

    }
}
