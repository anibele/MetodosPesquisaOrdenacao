/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_telefonia;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author gusta
 */
public class BuscarNumero {
    public static String buscarPorNumero(HashMap<String, ConexaoArquivo> mapa, String numero){

        if (mapa.containsKey(numero)) {
            ConexaoArquivo conexao = mapa.get(numero);
            return conexao.getDados();
        } else {
            JOptionPane.showMessageDialog(null, "Erro: O número não foi localizado na base de dados!");
            return null;
        }
    }
    
}