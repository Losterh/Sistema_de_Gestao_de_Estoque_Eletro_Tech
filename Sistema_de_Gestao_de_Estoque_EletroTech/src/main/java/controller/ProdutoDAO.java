package controller;

import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoDAO {
    Connection conn;

    public ProdutoDAO() throws SQLException {
        this.conn = ConexaoSQLite.getConexao();
    }



    public ArrayList<Produto> getall() throws SQLException{
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * from Produto";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            Produto produto = new Produto();
            produto.setId(resultSet.getInt("id"));
            produto.setNome(resultSet.getString("nome"));
            produto.setDescricao(resultSet.getString("descricao"));
            produto.setCategoria(resultSet.getString("categoria"));

            produtos.add(produto);

        }

        return produtos;
    }
    public void insert() throws SQLException{
        String sql = "INSERT INTO Produto VALUES(null, ?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Informe a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.println("Informe a categoria do produto: ");
        String categoria = sc.nextLine();
        preparedStatement.setString(1,nome);
        preparedStatement.setString(2,descricao);
        preparedStatement.setString(3,categoria);
        preparedStatement.executeUpdate();
    }

}