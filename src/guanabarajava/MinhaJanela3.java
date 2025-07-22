package guanabarajava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela3 {
    private JPanel panel1;
    private JButton cliqueAquiButton;
    private JLabel lblMensagem;

    public MinhaJanela3() {
        cliqueAquiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Ola Mundo!");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Janela");
        frame.setContentPane(new MinhaJanela3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



