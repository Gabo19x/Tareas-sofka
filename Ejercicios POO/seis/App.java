package seis;

import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>(10);

        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int cant = 0;

        while (a) {
            int num = 0;
            System.out.println("Dame un numero: ");
            num = sc.nextInt();
            System.out.println("---\n");
            vec.add(num);

            for (int i = 0; i < vec.size(); i++) {
                int auxi = vec.get(i);

                for (int j = 0; j < vec.size(); j++) {
                    int auxj = vec.get(j);

                    if(auxj == auxi && vec.size() > 2){
                        cant++;

                        if (cant >= 2) {
                            System.out.println("\n");
                            a = false;
                        }
                    }
                }
                cant = 0;
            }
        }

        System.out.println("HAY 2 NUMEROS IGUALES!");
        recorrer(vec);
                    
    }

    private static void recorrer(Vector v){
        System.out.println("___");
        for (int i = 0; i < v.size(); i++) {
            
            System.out.println(v.get(i));
        }
        System.out.println("___");
        System.out.println("Tamaño vector: " + v.size());
        System.out.println("\n");
    }
}
