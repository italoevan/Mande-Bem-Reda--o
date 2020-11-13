package com.evinc.mandebem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.evinc.mandebem.grandes_nomes.Aristoteles;
import com.evinc.mandebem.grandes_nomes.Darwin;
import com.evinc.mandebem.grandes_nomes.Einstein;
import com.evinc.mandebem.grandes_nomes.Socrates;
import com.evinc.mandebem.topicos.Educacao;
import com.evinc.mandebem.topicos.Juventude;
import com.evinc.mandebem.topicos.Preconceito;
import com.evinc.mandebem.topicos.Sabedoria;
import com.evinc.mandebem.topicos.Saude;
import com.evinc.mandebem.topicos.Sucesso;
import com.evinc.mandebem.topicos.Trabalho;
import com.evinc.mandebem.topicos.Violencia;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.evinc.mandebem.MainActivity;

public class Home extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView adView;
    private MainActivity mainActivity = new MainActivity();
    private CardView cardEinstein;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        adView = findViewById(R.id.adView);
        cardEinstein = (CardView) findViewById(R.id.cardEinstein);





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Interestical
        carregarInter();


        //Anuncio
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);








    }

    @Override
    protected void onResume() {
        super.onResume();
        //Interestical


        carregarInter();


    }
    public void carregarInter(){
        MobileAds.initialize(this,
                "ca-app-pub-6321157595470088~7268826837");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6321157595470088/8390336816");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

    @Override
    protected void onPause() {
        super.onPause();


        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();

        }



    }

   //Grandes Nomes

    public void abrirEinstein(View view){
        startActivity(new Intent(getApplicationContext(), Einstein.class));

    }
    public void abrirSocrates(View view){
        startActivity(new Intent(getApplicationContext(), Socrates.class));

    }

    public void abrirAristoteles(View view){
        startActivity(new Intent(getApplicationContext(), Aristoteles.class));

    }

    public void abrirDarwin(View view){
        startActivity(new Intent(getApplicationContext(), Darwin.class));

    }













    //Topicos
    public void abrirEducacao(View view){

        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(),Educacao.class));
        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }





    }
    public void abrirViolencia(View view){
        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Violencia.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }




    }

    public void abrirJuventude(View view){

        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Juventude.class));
        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }




    }

    public void abrirSaude(View view){
        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Saude.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }






    }
    public void abrirSabedoria(View view){

        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Sabedoria.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }



    }

    public void abrirTrabalho(View view){
        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Trabalho.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }



    }

    public void abrirPreconceito(View view){

        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Preconceito.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }




    }

    public void abrirSucesso(View view){
        if(mainActivity.isConnected(getApplication())){
            startActivity(new Intent(getApplicationContext(), Sucesso.class));

        }else{

            Toast.makeText(this,"Verifique sua conexão ou aguarde alguns segundos",Toast.LENGTH_LONG).show();

        }


    }




}