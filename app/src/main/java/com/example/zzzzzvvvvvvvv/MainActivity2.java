package com.example.zzzzzvvvvvvvv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity2 extends FragmentActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button knopka1 = (Button) findViewById(R.id.knopka1);
        knopka1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent knopka1 = new Intent()
    }
}
