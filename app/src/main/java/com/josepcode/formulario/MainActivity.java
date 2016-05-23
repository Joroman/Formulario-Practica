package com.josepcode.formulario;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout     mNombre;
    private DatePicker          mDate;
    private TextInputLayout     mTelefono;
    private TextInputLayout     mEmail;
    private TextInputLayout     mDescripción;
    private Contacto            mContacto;
    private Button              mBtSiguiente;
    private String fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNombre         =(TextInputLayout)findViewById(R.id.input_layout_name);
        mDate           =(DatePicker) findViewById(R.id.date_packer);
        mTelefono       =(TextInputLayout)findViewById(R.id.til_telefono);
        mEmail          =(TextInputLayout)findViewById(R.id.til_email);
        mDescripción    =(TextInputLayout)findViewById(R.id.til_descripción_contacto);
        mBtSiguiente    =(Button)findViewById(R.id.bt_siguiente);

        mBtSiguiente.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                actualizarDatos();
                Intent intent = new Intent(MainActivity.this, ConfirmarDatosActivity.class );
                intent.putExtra("id_nombre"     ,mContacto.getNombre());
                intent.putExtra("id_telefono"   ,mContacto.getTelefono() );
                intent.putExtra("id_email"      ,mContacto.getEmail());
                intent.putExtra("id_comentarios", mContacto.getComentarios());
                intent.putExtra("id_fecha"      ,mContacto.getFechaNaciemiento());
                startActivity(intent);
            }
        });
    }
    private void actualizarDatos(){
        String mounth;
        String day;
        String year;
        String fecha;
        mContacto= new Contacto(mNombre.getEditText().getText().toString(),
                mTelefono.getEditText().getText().toString(),
                mEmail.getEditText().getText().toString());
        mContacto.setComentarios(mDescripción.getEditText().getText().toString());

        //Fecha
        mounth  =String.valueOf(mDate.getMonth());
        day     =String.valueOf(mDate.getDayOfMonth());
        year    =String.valueOf(mDate.getYear());
        fecha   = day+"/"+mounth+"/"+year;

        mContacto.setFechaNaciemiento(fecha);
        System.out.println( "Nomnbnre: "    +mContacto.getNombre()+
                "Telefono :"    +mContacto.getTelefono()+
                "Email :"       +mContacto.getEmail()+
                "Comentarios: " +mContacto.getComentarios()+
                "la fecha es : "+fecha);

    }

}
