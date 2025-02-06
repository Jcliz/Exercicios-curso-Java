package jdbc.desafio;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaLetra {
    public static void main(String[] args) throws SQLException {
        Scanner leitor = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConnection();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";

        System.out.println("Informe a letra desejada para a pesquisa:");
        String letra = leitor.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + letra + "%");
        ResultSet resultado = stmt.executeQuery();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " -> " + p.getNome());
        }

        stmt.close();
        conexao.close();
        leitor.close();
    }
}
