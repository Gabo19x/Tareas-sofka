import java.util.Scanner;

public class Generador{
    public static void main(String[] args) {
        boolean a = true;
        double[] numeros = {};
        
        while (a) {
            System.out.println("Seleccione la opcion:");
            System.out.println("1) Organizar metodo burbuja.\n2) Organizar por quick sort.");
            Scanner scanner = new Scanner(System.in);
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    numeros = numerosAleatorios();
                    System.out.println("--- Numeros aleatorios ---");
                    imprimir(numeros);
                    numeros = burbuja(numeros);
                    System.out.println("--- Numeros ordenados ---");
                    imprimir(numeros);
                    
                    a = false;
                    break;
                case 2:
                    numeros = numerosAleatorios();
                    System.out.println("--- Numeros aleatorios ---");
                    imprimir(numeros);
                    quickSort(numeros, 0, (numeros.length - 1));
                    System.out.println("--- Numeros ordenados ---");
                    imprimir(numeros);
                    a = false;
                    break;
            
                default:
                    System.out.println("Seleccion incorrecta. Elija entre ( 1 ) y ( 2 )");
                    break;
            }
        }
    }

    /**
     * FUNCION: genera numeros aleatorios reales.
     * @return array de numeros.
     */
    private static double[] numerosAleatorios(){
        
        double[] lista = new double[10];

        for (int i = 0; i < lista.length; i++) {
            double x = Math.random()*(10 + 1);
            lista[i] = x;
        }
        
        return lista;
    }


    /**
     * FUNCION: organiza los numeros con metodo burbuja.
     * @param numeros un array de numeros.
     * @return array de numeros ordenados.
     */
    private static double[] burbuja(double[] numeros){
        double aux = 0;

        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-i; j++) {
                
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        double nuevaLista[] = numeros;
        return nuevaLista;
    }

    /**
     * FUNCION: organiza los numeros con metodo quick sort.
     * @param numeros un array de numeros.
     * @param inicio numero de incio.
     * @param fin numero final.
     * @return array de numeros ordenados.
     */
    private static void quickSort(double[] numeros, int inicio, int fin){

        if (inicio >= fin) {    return;}
        int i = inicio;
        int d = fin;
        double x = numeros[inicio];
        
        while (i < d) {
            while (numeros[i] <= x && i < d) {
                i++;
            }
            while (numeros[d] > x) {  
                d--;
            }
            
            if(i < d){
                double aux = numeros[i];
                numeros[i] = numeros[d];
                numeros[d] = aux;
            }
        }

        numeros[inicio] = numeros[d];
        numeros[d] = x;
        
        if(inicio < (d-1)){
            quickSort(numeros, inicio, (d-1));
        }
        if ((d+1) < fin) {
            quickSort(numeros, (d+1), fin);
        }

        // if (d > inicio){
        //     double aux = numeros[inicio];
        //     numeros[inicio] = numeros[d];
        //     numeros[d] = aux;
        // }

        // quickSort(numeros, inicio, (d-1));
        // quickSort(numeros, (d+1), fin);
    }

    /**
     * FUNCION: imprime los valores de un array.
     * @param lista un array de numeros.
     */
    private static void imprimir(double[] lista){
        for (double d : lista) {
            System.out.println("-> "+d);
        }
        System.out.println("------------------------");
    }
}