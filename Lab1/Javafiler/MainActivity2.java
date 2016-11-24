package com.example.victo.newlab1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Main Layout
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setPadding(dpToPx(10, this),dpToPx(20, this),dpToPx(10,this),dpToPx(20,this));

        //Holder Layout
        LinearLayout holderLayout = new LinearLayout(this);
        holderLayout.setOrientation(LinearLayout.HORIZONTAL);
        LayoutParams holderParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        //Left and Right Layouts
        LinearLayout left = new LinearLayout(this);
        left.setOrientation(LinearLayout.VERTICAL);
        LayoutParams leftParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        LinearLayout right = new LinearLayout(this);
        right.setOrientation(LinearLayout.VERTICAL);
        LayoutParams rightParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        //TextViews to the left
        LayoutParams textParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        TextView name = new TextView(this);
        name.setText("Namn");
        int dp11 = dpToPx(11,this);
        name.setPadding(0,dp11,0,dp11);

        TextView password = new TextView(this);
        password.setText("Lösenord");
        password.setPadding(0,dp11,0,dp11);

        TextView email = new TextView(this);
        email.setText("Epost");
        email.setPadding(0,dp11,0,dp11);

        TextView age = new TextView(this);
        age.setText("Ålder");
        age.setPadding(0,dp11,0,dp11);

        //EditText and SeekBar to the right
        LayoutParams editParams = new LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        EditText editName = new EditText(this);

        EditText editPassword = new EditText(this);
        editPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);

        EditText editEmail = new EditText(this);

        SeekBar editAge = new SeekBar(this);
        editAge.setPadding(dpToPx(15,this),dpToPx(10,this),dpToPx(15,this),0);

        //Add to layouts
        left.addView(name, textParams);
        left.addView(password, textParams);
        left.addView(email, textParams);
        left.addView(age, textParams);

        right.addView(editName, editParams);
        right.addView(editPassword, editParams);
        right.addView(editEmail, editParams);
        right.addView(editAge, editParams);

        holderLayout.addView(left, leftParams);

        holderLayout.addView(right,rightParams);

        mainLayout.addView(holderLayout, holderParams);

        setContentView(mainLayout);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public int dpToPx(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }


}
