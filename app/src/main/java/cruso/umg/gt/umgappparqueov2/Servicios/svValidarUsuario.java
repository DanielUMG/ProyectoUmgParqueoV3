package cruso.umg.gt.umgappparqueov2.Servicios;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import cruso.umg.gt.umgappparqueov2.Mapa;


/**
 * Created by Daniel-HDZ on 29/07/2017.
 */

public class svValidarUsuario extends AsyncTask<String, Integer, String> {
    private Context context;
    private static final String SOAP_ACTION = "svParque#ValidarUsuario";
    private static final String OPERATION_NAME = "ValidarUsuario";
    private static final String WSDL_TARGET_NAMESPACE = "svParque";
    public static final String SOAP_ADDRESS = "http://grupoumg.com/servicios/SubSistemas/Parqueo/srvParqueo.php";

    public svValidarUsuario(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params){
        String result = null;
        SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER10);

        envelope.dotNet = false;

        envelope.setOutputSoapObject(request);
        HttpTransportSE transporte = new HttpTransportSE(SOAP_ADDRESS);

        request.addProperty("usuario", params[0]);
        request.addProperty("contrasena", params[1]);
        try{
            transporte.call(SOAP_ACTION, envelope);
            SoapPrimitive resultadoSOAP = (SoapPrimitive)envelope.getResponse();
            result = resultadoSOAP.toString();
        }
        catch (Exception e){
            Toast notificacionError = Toast.makeText(context, e.getMessage(),Toast.LENGTH_LONG);
            notificacionError.show();
        }

        return  result;
    }

    @Override
    protected void onPostExecute(String resultado){

        int numero = Integer.parseInt(resultado);
        switch (numero){
            case 0:
                Toast notificacionExito = Toast.makeText(context, "El usuario es correcto", Toast.LENGTH_LONG);
                notificacionExito.show();
                Intent ven=new Intent(context, Mapa.class);
                context.startActivity(ven);
                break;
            case 1:
                Toast notificacionIncorrecto = Toast.makeText(context, "Contraseña incorrecta", Toast.LENGTH_LONG);
                notificacionIncorrecto.show();
                break;
            case 2:
                Toast notificacionNoExiste = Toast.makeText(context, "Usuario no exite", Toast.LENGTH_LONG);
                notificacionNoExiste.show();
                break;
        }
        Toast.makeText(context, resultado, Toast.LENGTH_SHORT).show();
    }
}
