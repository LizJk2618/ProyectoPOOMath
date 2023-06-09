package Model;

public class Numeroastro {
    public static boolean NumeroAstro(int numero) {
            int numeroOriginal = numero;
            int longitud = String.valueOf(numero).length();
            int sumaDigitos = 0;
            while (numero > 0) {
              int digito = numero % 10;
              sumaDigitos += Math.pow(digito, longitud);
              numero /= 10;
            }
            return sumaDigitos == numeroOriginal;
          }
    }