package lista_avaliativa.q06;

import javax.swing.*;
import java.awt.*;

public class MinhaTela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha tela");
        JLabel label1 = new JLabel("Nome:");
        JLabel label2 = new JLabel("Telefone:");
        JButton botao  = new JButton("Salvar");
        JTextField campo_texto1 = new JTextField();
        JTextField campo_texto2 = new JTextField();
        FlowLayout f1 = new FlowLayout();


        campo_texto1.setColumns(10);
        campo_texto2.setColumns(10);

        frame.setLayout(f1);
        frame.add(label1);
        frame.add(campo_texto1);
        frame.add(label2);
        frame.add(campo_texto2);
        frame.add(botao);

        frame.setSize(600, 150);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
