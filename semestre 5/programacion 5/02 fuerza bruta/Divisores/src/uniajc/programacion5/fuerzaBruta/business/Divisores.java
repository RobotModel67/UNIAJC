package uniajc.programacion5.fuerzabruta.business;

/**
 *
 * @author Jorge Luis Valencia Plaza
 */
public class Divisores {
    
    public static int Primero(int p) {
        return 1;
    }
    public static int Siguiente(int p, int c) {
        if (c < p)
            return c+1;
        else
            return -1;
    }
    public static boolean Valido(int p, int c) {
        return (p % c == 0);
    }
    public static String Mostrar(int p, int c) {
        return String.format("El número %d es divisor de %d", c, p);
    }
    
}
