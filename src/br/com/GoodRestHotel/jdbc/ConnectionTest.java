
package br.com.GoodRestHotel.jdbc;

import javax.swing.JOptionPane;


public class ConnectionTest {
        public static void main(String[] args) {
        
            try{
                new ConnectionFactory().getConnection();
                JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao conectar: /n" + e);
        }
    
        }
        
}
