
package uniajc.programacion5.fuerzaBruta.view;

import uniajc.programacion5.fuerzabruta.business.Divisores;

/**
 *
 * @author estudiante103
 */
public class Program {
    public static void main(String[] arguments) {
        System.out.println("Programación 5 - Fuerza Bruta\n");
        
        MainWindow window = new MainWindow();
        window.setVisible(true);
        
        //testDivisores();
        
    }
    
    
    
    public static void testDivisores() {
        
        System.out.println("Encontrando divisores ***");
        Divisores divisores = new Divisores();
        int p = 15;
        int c = divisores.Primero(p);
        while (c > 0) {            
            if (divisores.Valido(p, c)) {
                System.out.println(
                    divisores.Mostrar(p, c));
            }
            c = divisores.Siguiente(p, c);
        }
        System.out.println("*** END ***");
    }
}
