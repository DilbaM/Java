public class Calculadora {
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public double dividir(int n1, int n2) {
        if (n2 == 0); {
            double total = (double) n1 / n2;
            return total;
        }
    }
}

