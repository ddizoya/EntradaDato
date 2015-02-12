package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daviddizoya y @beatrizhernandezsouto
 */

/**
 * 
 * @class Esta clase Metodo permite emplear el método introducir.
 * 
 */
public class Metodo {

    /**
     * El método introducir recibe un entero, y según si es 1 o 0,
     * pedirá que se introduzca un valor por consola o por ventana.
     * @param entero Se le envía por parámetro un número entero.
     * @return Devuelve el entero impreso por consola.
     */
    public int introducir(int entero) {
        if (entero == 0) {
            Scanner nw = new Scanner(System.in);
            int num = nw.nextInt();
            System.out.println(num);
            return entero;
        } else {
            if (entero == 1) {
                String res = JOptionPane.showInputDialog(null, "Introduzca un numero");
                int nume = Integer.parseInt(res);
                return nume;
            } else {
                System.out.println("Error, introducir parametro valido");
                return 0;
            }
        }
    }
}
