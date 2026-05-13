import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Form extends JFrame {
    private JPanel MyPanel;
    private JButton rButton;
    private JButton button2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;

    public GUI_Form(){
        setContentPane(MyPanel);
        setTitle("Cosma ma suge");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = "Ceva";
                JOptionPane.showMessageDialog(GUI_Form.this, string);
            }
        });
    }


}
