package jdbc.desafio;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdatePorID {
    public static void main(String[] args) throws SQLException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o código da pessoa: ");

        int id = leitor.nextInt();

        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        String select = "SELECT * FROM pessoas WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConnection();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, id);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
            System.out.println("O nome atual é " + p.getNome());
            leitor.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = leitor.nextLine();


            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        conexao.close();
        leitor.close();
    }
}
