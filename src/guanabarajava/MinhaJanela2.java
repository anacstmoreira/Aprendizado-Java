package guanabarajava;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela2 {
    private JButton cliqueEmMimButton;
    private JPanel janela;
    private JLabel mensagem;
    final int[] contador= {0};

    public MinhaJanela2() {
        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador[0]++;
                mensagem.setText("Cliques: " + contador[0]);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Janela");
        frame.setContentPane(new MinhaJanela2().janela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

