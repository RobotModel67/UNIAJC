
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
    
    /**
     * Test de Divisores
     */
    
    public static void testDivisores() {
        
        System.out.println("Encontrando divisores ***");
        int p = 15;
        int c = Divisores.Primero(p);
        while (c > 0) {            
            if (Divisores.Valido(p, c)) {
                System.out.println(
                    Divisores.Mostrar(p, c));
            }
            c = Divisores.Siguiente(p, c);
        }
        System.out.println("*** END ***");
    }
}
