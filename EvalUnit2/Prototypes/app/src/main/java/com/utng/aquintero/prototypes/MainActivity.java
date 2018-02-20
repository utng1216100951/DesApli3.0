package com.utng.aquintero.prototypes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.perfil:
                Toast.makeText(this, "Has Pulsado la seccion de menu 'Perfil'",Toast.LENGTH_SHORT).show();
                break;
            case R.id.registro:
                Toast.makeText(this, "Has Pulsado la seccion de menu 'Inicio de Sesion'",Toast.LENGTH_SHORT).show();
                break;
            case R.id.acerca_de:
                Toast.makeText(this, "Has Pulsado la seccion de menu 'Acerca de'",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
