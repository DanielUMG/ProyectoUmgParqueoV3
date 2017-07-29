package cruso.umg.gt.umgappparqueov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.EditText;
import android.widget.TextView;

public class Reservar extends AppCompatActivity {
    String datee = (DateFormat.format("dd-MM-yyyy hh:mm:ss", new java.util.Date()).toString());
    String recu,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);
        Bundle datos = this.getIntent().getExtras();
        this.recu = datos.getString("variable");

        TextView err = (TextView)findViewById(R.id.noparqueo);
        err.setText(recu);

        TextView inicio = (TextView)findViewById(R.id.inicio);

        EditText nombrereserva = (EditText) findViewById(R.id.nombrereserva);
        this.name =  nombrereserva.getText().toString();

        inicio.setText(datee);

    }








}
