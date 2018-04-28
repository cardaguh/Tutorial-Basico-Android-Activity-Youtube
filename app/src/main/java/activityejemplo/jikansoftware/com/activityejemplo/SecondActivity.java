package activityejemplo.jikansoftware.com.activityejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();
        String mensaje = intent.getStringExtra("EXTRA");

        TextView muestraMensaje = (TextView) findViewById(R.id.editText);
        muestraMensaje.setText(mensaje);
    }
}
