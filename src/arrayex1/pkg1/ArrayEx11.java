public class ArrayEx11 {

    public static void main(String args[]) {
        
        int[] score = new int[9]; // matriz unidimensional para 9 valores inteiros
        
        byte[] values = new byte[10]; // matriz de bytes unidimensional de tamanho 10
        for (int i = 0; i < values.length; i++) {
            values[i] = 1; // inicializa todas as entradas de 'values' com 1
        }
        
        //int[] primeNum = new long[20]; // linha comentada originalmente
        //int even=new int[5]; // linha comentada originalmente
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
