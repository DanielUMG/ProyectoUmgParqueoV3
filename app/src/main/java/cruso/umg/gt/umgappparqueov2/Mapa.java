package cruso.umg.gt.umgappparqueov2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
    }

    public void ocupar01(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento01);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        // this.ticketdiario.add(0,d);
        // int estacionamiento=01;

        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "1");
        startActivity(i);

        //et1 = (EditText) findViewById(R.id.noparqueo);
        //et1.setText("1");

    }


    public void ocupar02(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento02);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "2");
        startActivity(i);


    }
    public void ocupar03(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento03);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "3");
        startActivity(i);

    }
    public void ocupar04(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento04);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);

        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "4");
        startActivity(i);

    }
    public void ocupar05(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento05);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "5");
        startActivity(i);


    }
    public void ocupar06(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento06);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "6");
        startActivity(i);
    }
    public void ocupar07(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento07);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "7");
        startActivity(i);
    }
    public void ocupar08(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento08);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "8");
        startActivity(i);
    }
    public void ocupar09(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento09);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "9");
        startActivity(i);
    }
    public void ocupar10(View v){
        Button boton = (Button) findViewById(R.id.estacionamiento10);
        //boton.setBackgroundColor(Color.RED);
        boton.setBackgroundResource(R.drawable.auto);
        Intent i = new Intent(this, Reservar.class);
        i.putExtra("variable", "10");
        startActivity(i);
    }


}
