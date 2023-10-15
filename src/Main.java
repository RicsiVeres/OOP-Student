import pack1.Pack1;
import pack2.Pack2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pack1 pack1 = new Pack1();
        Pack2 pack2 = new Pack2();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Menu: \n \t 1. Pack1 \n \t 2. Pack2 \n");
    int command = scan.nextInt();
        while (command != 0){
            switch (command){
                case 1:
                    pack1.labor1();
                    break;
                case 2:
                    pack2.labor2(args);
                    break;
            }
        System.out.println(" Menu: \n \t 1. Pack1 \n \t 2. Pack2 \n");
        command = scan.nextInt();
        }
    }
}