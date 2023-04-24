package Model;

public class Numeroperfecto {
        public static boolean NumeroPerfecto(int numero) {
            int sumaDivisores = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            return sumaDivisores == numero;
        }
    
    }
    
    
}
