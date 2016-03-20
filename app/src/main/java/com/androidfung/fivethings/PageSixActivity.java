package com.androidfung.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Phoebe on 20/3/2016.
 */
public class PageSixActivity extends Activity {

    Button p6Button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_four);

        p6Button = (Button)findViewById(R.id.p6Button);

        p6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:0,0?q=Banská Bystrica");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            }
        });
    }
}
