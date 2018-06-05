package edu.tectii.eva2_2_screen_preferences;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //insertar fragmento dinamicamente
        //fragment manager gragment transection
        FragmentManager fmFragMan = getFragmentManager();
        FragmentTransaction ftFragTra = fmFragMan.beginTransaction();
        ftFragTra.replace(android.R.id.content, new MiPantallaPrefetencias());
        ftFragTra.commit();

    }
    //este fragmento crea la pantalla
    public static class MiPantallaPrefetencias extends PreferenceFragment{
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.activity_preferences);
        }
    }
}
