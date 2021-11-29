package arreglo;

public class Arrays {
    public static void main(String[] args){
        Arrays arr = new Arrays();
        int[][][] numeros = arr.crearArr();
        arr.imprimirArr(numeros);
    }
    public int[][][] crearArr() {
        int[][][] numeros = new int[4][4][4];
        for( int i = 0; i < numeros.length; i++ ) {
            for (int j = 0; j < numeros[i].length; j++) {
                for (int k = 0; k < numeros[j].length; k++) {
                    numeros[i][j][k] = (int)Math.floor(Math.random()*20);
                }
            }
        }
        return numeros;
    }
    private void imprimirArr(int[][][] numeros) {
        System.out.println("Elementos del array: ");
        for (int[][] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                for (int k = 0; k < numeros[j].length; k++) {
                    System.out.println(numero[j][k]);
                }
            }
        }
    }
}
