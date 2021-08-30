package acesso_bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Banco {
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection == null){
            try{
                Class.forName("org.postgresql.Driver");
                String host = "localhost";
                String port = "5434";
                String database = "postgres";
                String user = "postgres";
                String pass = "SENAI";
                String url = "jdbc:postgresql://"+host+":"+port+"/"+database;
                connection = DriverManager.getConnection(url, user, pass);                
                
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void close(){
        if (connection == null){
            throw new RuntimeException("Nenhuma conexão aberta!");
        }
        else{
            try{
                connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
 
    public static void salvar (Pessoa pessoa){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO pessoa (cpf, id_carro, nome, endereco, telefone) values(?, ?, ?, ?, ?)");
            ps.setString(1, pessoa.getCpf());
            ps.setString(2, pessoa.getId_carro());
            ps.setString(3, pessoa.getNome());
	    ps.setString(4, pessoa.getEndereco());
	    ps.setString(5, pessoa.getTelefone());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void salvar (Carro carro){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO carro (marca, modelo) values(?, ?)");
            ps.setString(1, carro.getMarca());
            ps.setString(2, carro.getModelo());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void criar_tabela (String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
      
            String comando = "CREATE TABLE " + tabela + " (";
            for(String i : atributo){
                comando = comando + i + ",";
            }
            comando = comando.substring(0, comando.length() -1);
            comando = comando + " );";

            System.out.println(comando);
            
            PreparedStatement ps = con.prepareStatement(comando);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void visualiza_tabela(String tabela, String... atributo){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM "+ tabela);
            ResultSet rs = ps.executeQuery();
            
            String s = "";
            while(rs.next()){
                for(String i : atributo){
                    s = s + " | " +rs.getString(i);
                }
                s = s + "\n";
            }
            System.out.println(s);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleta(int id){
        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void atualizaBanco (Pessoa pessoa){

        try{
            Connection con = Banco.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE pessoa SET nome = ?, cpf = ? WHERE id = " + pessoa.getId_carro());
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void criarTabela(String string, String string2, String string3, String string4) {
    }
}