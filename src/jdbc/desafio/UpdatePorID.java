package jdbc.desafio;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdatePorID {
    public static void main(String[] args) throws SQLException {
        Scanner leitor = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConnection();
        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        System.out.println("Informe o código da pessoa: ");
        String id = leitor.nextLine();

        System.out.println("Informe o novo nome da pessoa:");
        String novoNome = leitor.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, novoNome);
        stmt.setString(2, id);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        if (stmt.execute()) {
            Statement stmt2 = conexao.createStatement();
            ResultSet resultado = stmt2.executeQuery("SELECT * FROM pessoas");

            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                pessoas.add(new Pessoa(codigo, nome));
            }

            for (Pessoa p : pessoas) {
                System.out.println("Pessoa alterada: " + p.getCodigo() + " -> " + p.getNome());
            }
        } else {
            System.out.println("Falha no processo.");
        }

        stmt.close();
        conexao.close();
        leitor.close();
    }
}
