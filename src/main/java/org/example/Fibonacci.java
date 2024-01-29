package ejemplo;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Cambia el valor de n según el término que desees calcular de la sucesión de Fibonacci
        System.out.println("El término " + n + " de Fibonacci es: " + fibonacci(n));
    }
}
