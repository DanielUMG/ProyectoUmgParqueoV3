package cruso.umg.gt.umgappparqueov2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnlogin, btnregistro, btnmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void login(View v) {
        Intent btn1 = new Intent(MainActivity.this, Login.class);
        startActivity(btn1);

    }

    public void registro(View v) {

        Intent btn2 = new Intent(MainActivity.this, Registro.class);
        startActivity(btn2);
    }
}
