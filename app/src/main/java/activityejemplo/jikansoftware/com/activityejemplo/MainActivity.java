package activityejemplo.jikansoftware.com.activityejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView miMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miMensaje = (EditText)findViewById(R.id.editText2);

        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }

    public void goToSecondActivity(){
        Intent i = new Intent(this, SecondActivity.class);
        String mensaje = miMensaje.getText().toString();
        i.putExtra("EXTRA", mensaje);
        startActivity(i);
        //finish();//Invoca el onDestroy() y muere esta actividad
    }
}
