package com.evinc.mandebem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.evinc.mandebem.topicos.Educacao;

public class MainActivity extends AppCompatActivity {

   public Button entrar;
   public ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        entrar = findViewById(R.id.buttonEntrar);
        progressBar = findViewById(R.id.progressBar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isConnected(getApplication())){

                    startActivity(new Intent(getApplicationContext(),Home.class));
                    finish();
                }else{
                    progressBar.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplication(),"Verifique sua conexão com a internet ou tente novamente",Toast.LENGTH_LONG).show();

                }




            }
        });
    }

    public boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if ( cm != null ) {
            NetworkInfo ni = cm.getActiveNetworkInfo();

            return ni != null && ni.isConnected();
        }

        return false;
    }


}