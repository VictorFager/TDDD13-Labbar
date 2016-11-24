package com.example.victor.newlab1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(20,20,20,20);

        Button button = new Button(this);
        button.setText("Knapp");
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        LayoutParams paramsCenter = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        LayoutParams paramsFill = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        paramsCenter.gravity = Gravity.CENTER_HORIZONTAL;
        button.setLayoutParams(params);

        EditText textField = new EditText(this);
        textField.setHint("Text fält");
        textField.setPadding(0,40,0,40);
        textField.setLayoutParams(params);

        RatingBar ratingBar = new RatingBar(this);
        ratingBar.setPadding(0,40,0,40);
        ratingBar.setLayoutParams(paramsCenter);

        EditText bigText = new EditText(this);
        bigText.setLayoutParams(paramsFill);
        bigText.setText("ett text fält som\nklarar\nflera rader\noch använder det skärmutrymme som finns");
        bigText.setTextSize(20);

        layout.addView(button);
        layout.addView(textField);
        layout.addView(ratingBar);
        layout.addView(bigText);
        setContentView(layout);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}

