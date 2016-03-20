package com.androidfung.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageThreeActivity extends Activity {


    TextView p2TextView;
    TextView p4TextView;
    Button p3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_three);


        p2TextView = (TextView)findViewById(R.id.pThreePrevious);
        p4TextView = (TextView)findViewById(R.id.pThreeNext);
        p3Button = (Button)findViewById(R.id.p3Button);

        p4TextView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(PageThreeActivity.this, PageFourActivity.class);
                    startActivity(intent);
                }
           });

                p2TextView.setOnClickListener(new View.OnClickListener(){
                                                  public void onClick(View v){
                                                      Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                                                      startActivity(intent);
                                                  }
                                              }

        );

        p3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Tallinn");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            }
        });

    }
}
