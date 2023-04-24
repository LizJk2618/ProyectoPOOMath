package Model;

public class Numeroamigo {

    public static int hallarNumeroAmigo(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
          if (numero % i == 0) {
            sumaDivisores += i;
          }
        }
        int sumaDivisoresdos = 0;
        for (int i = 1; i < sumaDivisores; i++) {
          if (sumaDivisores % i == 0) {
            sumaDivisoresdos += i;
          }
        }
        if (sumaDivisoresdos == numero && sumaDivisores != numero) {
          return sumaDivisores;
        } else {
          return -1;
        }
      }
}
}
