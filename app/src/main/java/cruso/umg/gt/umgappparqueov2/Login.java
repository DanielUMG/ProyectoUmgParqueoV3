package cruso.umg.gt.umgappparqueov2;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import cruso.umg.gt.umgappparqueov2.Servicios.svValidarUsuario;

public class Login extends AppCompatActivity {

    EditText et1,et2;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        et1= (EditText) findViewById(R.id.etusuario);
        et2= (EditText) findViewById(R.id.etcontrasena);
    }

    public void ingresar(View v){
        String usuario=et1.getText().toString();
        String contrasena=et2.getText().toString();
        new svValidarUsuario(this).execute(usuario,contrasena);
    }
}
