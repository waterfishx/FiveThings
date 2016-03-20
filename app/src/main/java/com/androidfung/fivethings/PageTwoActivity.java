package com.androidfung.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PageTwoActivity extends Activity {

    TextView p3TextView;
    TextView p1TextView;
    Button p2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);

        p1TextView = (TextView)findViewById(R.id.pTwoPrevious);
        p3TextView = (TextView)findViewById(R.id.pTwoNext);
        p2Button = (Button)findViewById(R.id.p2Button);

        p3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intent);
            }
        });

        p1TextView.setOnClickListener(new View.OnClickListener(){
           @Override
                   public void onClick(View v){
                Intent intent = new Intent(PageTwoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        p2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Vilnius");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            }
        });

    }
}
