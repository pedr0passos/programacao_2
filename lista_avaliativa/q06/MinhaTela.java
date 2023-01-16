package lista_avaliativa.q06;

import javax.swing.*;

public class MinhaTela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha tela");
        JLabel label1 = new JLabel("Nome:");
        JLabel label2 = new JLabel("Telefone:");
        JTextField campo_texto1 = new JTextField();
        JTextField campo_texto2 = new JTextField();

        frame.add(label1);
        frame.add(label2);
        frame.add(campo_texto1);
        frame.add(campo_texto2);

        frame.setSize(900, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
