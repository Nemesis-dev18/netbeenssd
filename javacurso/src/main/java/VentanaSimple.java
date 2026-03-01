
import javax.swing.*;

public class VentanaSimple {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi primera ventana");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
