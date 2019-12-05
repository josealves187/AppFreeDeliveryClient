package br.com.jose.alves.freedeliverycliente.util;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferencias {

    private Context context;
    private SharedPreferences preferences;
    private String NOME_ARQUIVO = "app.preferencia";
    private int MODE = 0;
    private  SharedPreferences.Editor editor;


    private final String EMAIL_USUARIO_LOGADO = "email_usuario-logado";
    private final String SENHA_USUARIO_LOGADO = "senha_usuario-logado";

    public Preferencias(Context contextParametro){
        context = contextParametro;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, MODE);

        //associando preferences  a edit()
        editor = preferences.edit();
    }
    public void salvaUserPreferencia(String email, String senha){
        editor.putString(EMAIL_USUARIO_LOGADO, email);
        editor.putString(SENHA_USUARIO_LOGADO , senha);
        editor.commit();
    }
    public String getEmailUsuarioLogado(){
        return preferences.getString(EMAIL_USUARIO_LOGADO, null);
    }
    public String getSenhaUsuarioLogado(){
        return preferences.getString(SENHA_USUARIO_LOGADO, null);
    }
}
