package com.radhabbit.alc4challenge;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface fregular = Typeface.createFromAsset(getAssets(),  "fonts/D-DIN.ttf");
        Typeface fbold = Typeface.createFromAsset(getAssets(),  "fonts/D-DIN-Bold.ttf");
        Typeface fitalic = Typeface.createFromAsset(getAssets(),  "fonts/D-DIN-Italic.ttf");

        TextView tx = findViewById(R.id.title);
        tx.setTypeface(fregular);

        Button about_txt = findViewById(R.id.about_button);
        about_txt.setTypeface(fbold);

        Button profile_txt = findViewById(R.id.profile_button);
        profile_txt.setTypeface(fbold);


        View about = findViewById(R.id.about_button);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mabout();
            }
        });

        final View profile = findViewById(R.id.profile_button);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mprofile();
            }
        });
    }

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

    private void mabout(){
        Intent a_intent = new Intent(this, aboutActivity.class);
        startActivity(a_intent);
    }

    private void mprofile(){
        Intent p_intent = new Intent(this, profileActivity.class);
        startActivity(p_intent);
    }
}
