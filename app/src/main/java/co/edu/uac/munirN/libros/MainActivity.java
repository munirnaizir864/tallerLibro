package co.edu.uac.munirN.libros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean operacion = false;
    long acum=0;
    EditText data;
    Button button0,button1,button2,buttton3,button4,button5,button6,button7,button8,button9,buttonmas,buttonmenos,buttonpor,buttondiv,butttonsqrt,buttoninv,buttonc,buttonigual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2= findViewById(R.id.button2);   button2.setOnClickListener(this);
        buttton3= findViewById(R.id.button3);   buttton3.setOnClickListener(this);
        button4= findViewById(R.id.buttton4);   button4.setOnClickListener(this);
        button5= findViewById(R.id.button5);    button5.setOnClickListener(this);
        button6= findViewById(R.id.button6);  button6.setOnClickListener(this);
        button7= findViewById(R.id.buttton7);  button7.setOnClickListener(this);
        button8= findViewById(R.id.button8);  button8.setOnClickListener(this);
        button9= findViewById(R.id.button9);  button9.setOnClickListener(this);
        buttonmas= findViewById(R.id.buttonmas);   buttonmas.setOnClickListener(this);
        buttonmenos= findViewById(R.id.buttonmenos);   buttonmenos.setOnClickListener(this);
        buttonpor= findViewById(R.id.buttonpor);    buttonpor.setOnClickListener(this);
        buttondiv= findViewById(R.id.buttondiv);    buttondiv.setOnClickListener(this);
        butttonsqrt= findViewById(R.id.buttonsqrt);    butttonsqrt.setOnClickListener(this);
        buttoninv= findViewById(R.id.buttoninv);    buttoninv.setOnClickListener(this);
        buttonigual= findViewById(R.id.buttonequals);   buttonigual.setOnClickListener(this);
        buttonc= findViewById(R.id.butttonc);    buttonc.setOnClickListener(this);
        data= findViewById(R.id.edtdato);
       // data.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        String valor;
        long num=0;
          if(!TextUtils.isEmpty(data.getText().toString())) {
              num = Integer.parseInt(data.getText().toString());
              valor=data.getText().toString();
          }
          else{
           valor="";
          }
            switch(v.getId()){
            case R.id.button0: if (num!=0){
                            valor = valor + "0";
                            data.setText(valor);
                           }

                      break;

            case R.id.button1:
                valor = valor + "1";
                data.setText(valor);
                break;

            case R.id.button2:
                valor = valor + "2";
                data.setText(valor);
                break;

            case R.id.button3:
                valor = valor + "3";
                data.setText(valor);
                break;

                case R.id.buttonmas: if (!operacion){
                                 acum = Integer.parseInt(data.getText().toString());
                                data.setText("");
                                 operacion = true;}
                                break;

                case R.id.buttonequals:  data.setText(acum + Integer.parseInt(data.getText().toString())+ "");
                                    acum = acum + Integer.parseInt(data.getText().toString());
                                    operacion=false;
                   break;

                case R.id.butttonc: operacion = false;
                                  acum =0;
                                  data.setText("");
                               break;

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.menupaises:
                Intent i = new Intent(this, ListaLibros.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
