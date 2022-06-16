package android.guide.androidsharesheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button textBtn, inttResBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent shareIntent = new Intent();

        textBtn = findViewById(R.id.textBtn);
        inttResBtn = findViewById(R.id.intResBtn);


        textBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                shareIntent.setType("text/plain");

                Intent sendIntent = Intent.createChooser(shareIntent, null);
                startActivity(sendIntent);
            }
        });


        inttResBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

    }
}
