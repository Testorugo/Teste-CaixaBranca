/**
 * A classe Teste-Caixa-Branca contém métodos para conectar a um banco de dados e verificar um usuário.
 * É utilizada para fins de demonstração de caixa branca.
 */
package com.mycompany.teste.caixa.branca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hugo
 * @version 1.0
 * @since Release 1.0 da aplicação
 */
/**
 * Classe que representa um teste de caixa branca.
 */
public class TesteCaixaBranca {

// Ponto 1: Início
    /**
     * Método para conectar ao banco de dados.
     *
     * @return Uma conexão com o banco de dados ou null em caso de falha.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Ponto 2: Tentativa de conexão com o banco de dados
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Se ocorrer uma exceção, não faz nada e retorna null
        }
        return conn;
    }

    /**
     * Nome de usuário.
     */
    public String nome = "";
    /**
     * Resultado da verificação do usuário.
     */
    public boolean result = false;

    /**
     * Método para verificar um usuário no banco de dados.
     *
     * @param login O login do usuário a ser verificado.
     * @param senha A senha do usuário a ser verificada.
     * @return true se o usuário for encontrado, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL para realizar a verificação do usuário usuário
        sql += "select nome from usuarios";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        try {
            Statement st = conn.createStatement();
            // Ponto 3: Tentativa de execução da consulta SQL
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                // Ponto 4: Verificação do resultado da consulta
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Se ocorrer uma exceção, não faz nada
        }
        return result;
    }
}
