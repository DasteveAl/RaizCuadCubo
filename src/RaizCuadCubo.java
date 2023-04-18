import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaizCuadCubo extends JDialog{
    private JPanel Main;
    private JTextField txtList;
    private JButton borrarButton;
    private JButton salirButton;
    private JButton calcularButton;

    public RaizCuadCubo(JFrame parent) {
        super(parent);
        setTitle("Raiz-Cuadrado-Cubo");
        setContentPane(Main);
        setMinimumSize(new Dimension(450, 300));
        setModal(true);
        setLocationRelativeTo(parent);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RaCudCub raizcuacub = new RaCudCub();

                String list = txtList.getText();
                raizcuacub.setNumbers(list);
                int[] numbs = raizcuacub.getNumbers();

                JOptionPane.showMessageDialog(null, numbs);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtList.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        RaizCuadCubo form = new RaizCuadCubo(null);
    }
}
