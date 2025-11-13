/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_telefonia;

/**
 *
 * @author gusta
 */

import com.google.gson.Gson;

public class ConversorJson {

    // Converte uma String JSON para um objeto RegistroTelefonia
    public static RegistroTelefonia converterParaObjeto(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, RegistroTelefonia.class);
    }

    // Converte um objeto RegistroTelefonia de volta para JSON
    public static String converterParaJson(RegistroTelefonia registro) {
        Gson gson = new Gson();
        return gson.toJson(registro);
    }
}

