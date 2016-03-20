package com.androidfung.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageFiveActivity extends Activity {

    TextView p4TextView;
    TextView p6TextView;
    Button p5Button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_four);


        p4TextView = (TextView)findViewById(R.id.pFivePrevious);
        p6TextView = (TextView)findViewById(R.id.pFiveNext);
        p5Button = (Button)findViewById(R.id.p5Button);

        p4TextView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PageFiveActivity.this, PageFourActivity.class);
                startActivity(intent);
            }
        });

        p5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Reykjavík");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            }
        });

    }
}
