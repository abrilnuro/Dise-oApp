package com.example.aimew.laviedesign;

import android.animation.Animator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton buttonLove;
    FloatingActionButton buttonComment;
    FloatingActionButton buttonShare;
    boolean loveClick = false;

    private FrameLayout framePromociones;
    private FragmentTransaction transaction;
    private FragmentRecyclerPromo fragmentRecyclerPromo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //referenciar los botones
        buttonLove = (FloatingActionButton) findViewById(R.id.button_love);
        buttonComment = (FloatingActionButton) findViewById(R.id.button_comment);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_share);

        //hacer clickables los floatingButton
        buttonLove.setOnClickListener(this);
        buttonComment.setOnClickListener(this);
        buttonShare.setOnClickListener(this);

        //referenciar el framelayout
        framePromociones = (FrameLayout)findViewById(R.id.frame_prom_mapa);
        //colocar un fragmento por default en el frameLayout
        //iniciar transaccion
        transaction = getSupportFragmentManager().beginTransaction();
        //crear objeto del fragmento que se va a colocar
        fragmentRecyclerPromo = new FragmentRecyclerPromo();
        //colocar el fragmento en el frameLayout
        transaction.replace(R.id.frame_prom_mapa, fragmentRecyclerPromo);
        //realizar transaccion
        transaction.commit();

    }//onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_love:
                if (loveClick == true) {
                    buttonLove.setImageResource(R.drawable.icon_heart_gray);
                    loveClick = false;
                } else if (loveClick == false) {
                    buttonLove.setImageResource(R.drawable.icon_heart_red);
                    loveClick = true;
                }
                break;
            case R.id.button_comment:
                break;
            case R.id.button_share:
                break;
        }//switch
    }//onClick


}//class
