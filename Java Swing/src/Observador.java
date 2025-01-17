import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //fechar a aplicação quando fechar a janela
        janela.setSize(600, 300);
        janela.setLayout(new FlowLayout());//muda o layout
        janela.setLocationRelativeTo(null); //centralizar na tela do PC

        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!");
        });

        janela.setVisible(true);
    }
}
