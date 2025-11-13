/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_telefonia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author gusta
 */
public class ConexaoArquivo {

    private String dados;

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public ConexaoArquivo(String dados) {
        this.dados = dados;
    }

    public ConexaoArquivo() {
    }

    @Override
    public String toString() {
        return dados;
    }

    public static void conectar(HashMap<String, ConexaoArquivo> dadosTelefone) {
        String nomeArquivo = "telephony_sessions.txt";
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(";", 2);
                if (partes.length == 2) {
                    String numCelular = partes[0];
                    String dados = partes[1];

                    ConexaoArquivo conexao = new ConexaoArquivo(dados);
                    dadosTelefone.put(numCelular, conexao);
                }
            }
            leitor.close();

            System.out.println("Base carregada! || Total de registros: " + dadosTelefone.size());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }
    }

    public static int contarRepetidos(String numero) {
        String nomeArquivo = "telephony_sessions.txt";
        int contador = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (linha.startsWith(numero + ";")) {
                    contador++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return contador;
    }
    
}
