package com.androidfung.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageFourActivity extends Activity {

    TextView p3TextView;
    TextView p5TextView;
    Button p4Button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_four);


        p3TextView = (TextView)findViewById(R.id.pFourPrevious);
        p5TextView = (TextView)findViewById(R.id.pFourNext);
        p4Button = (Button)findViewById(R.id.p4Button);

        p3TextView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PageFourActivity.this, PageFiveActivity.class);
                startActivity(intent);
            }
        });

        p5TextView.setOnClickListener(new View.OnClickListener(){
                                          public void onClick(View v){
                                              Intent intent = new Intent(PageFourActivity.this, PageThreeActivity.class);
                                              startActivity(intent);
                                          }
                                      }

        );

        p4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Sofia");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            }
        });

    }
}
