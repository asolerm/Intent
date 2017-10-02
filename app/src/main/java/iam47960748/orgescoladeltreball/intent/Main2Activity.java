package iam47960748.orgescoladeltreball.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button;

    Intent originalIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(v -> showBrowser());

        originalIntent = getIntent();
    }

    /* private void showBrowser(){

         Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.escoladeltreball.org"));
         startActivity(intent);
     }*/
    private void showBrowser() {

        String url = originalIntent.getStringExtra(Intent.EXTRA_COMPONENT_NAME);
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(intent);
    }
}
