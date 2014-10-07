package cl.ucentral.calcu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MyActivity extends ActionBarActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        View botons = findViewById(R.id.idBotonSumar);
        botons.setOnClickListener(this);
        View botonr = findViewById(R.id.idBotonRestar);
        botonr.setOnClickListener(this);
        View botonm = findViewById(R.id.idBotonMultiplicar);
        botonm.setOnClickListener(this);
        View botond = findViewById(R.id.idBotonDividir);
        botond.setOnClickListener(this);

    }

    public void onClick(View vista){
        TextView temp;
        temp = (TextView)findViewById(R.id.editText3);
        TextView resultado = (TextView)findViewById(R.id.textView2);
        try{
            float a = Float.parseFloat(temp.getText().toString());
            temp = (TextView)findViewById(R.id.editText4);
            float b = Float.parseFloat(temp.getText().toString());

           if(vista == findViewById(R.id.idBotonSumar))
               resultado.setText("Resultado: " + (a + b));
           else if(vista == findViewById(R.id.idBotonRestar))
               resultado.setText("Resultado: " + (a - b));
           else if(vista == findViewById(R.id.idBotonMultiplicar))
               resultado.setText("Resultado: " + (a * b));
           else if(vista == findViewById(R.id.idBotonDividir))
               resultado.setText("Resultado: " + (a / b));

        }catch(Exception e){};


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
