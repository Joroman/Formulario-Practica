package com.josepcode.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JR on 23/05/2016.
 */
public class ConfirmarDatosActivity extends AppCompatActivity {
    private TextView mNombre;
    private TextView mFecha;
    private TextView mTelefon;
    private TextView mEmail;
    private TextView mComentarios;
    private Button   mEditarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        mNombre     =(TextView)findViewById(R.id.tw_nombre);
        mFecha      =(TextView)findViewById(R.id.tw_fecha);
        mTelefon    =(TextView)findViewById(R.id.tw_telefono);
        mEmail      =(TextView)findViewById(R.id.tw_email);
        mComentarios=(TextView)findViewById(R.id.tw_descripcion);
        mEditarDatos=(Button)findViewById(R.id.bt_editor_datos);

        Bundle parametros   = getIntent().getExtras();
        mNombre     .setText(parametros.getString("id_nombre"));
        mFecha      .setText(parametros.getString("id_fecha"));
        mTelefon    .setText("Tel."+parametros.getString("id_telefono"));
        mEmail      .setText("Email: "+parametros.getString("id_email"));
        mComentarios.setText("Descricpción: "+parametros.getString("id_comentarios"));

        mEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }

}

