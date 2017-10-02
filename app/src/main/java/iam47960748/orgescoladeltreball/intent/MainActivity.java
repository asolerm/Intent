package iam47960748.orgescoladeltreball.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(v -> switchActivity());
    }
    /*
    This method calls the secondActivity
    Intent: asynchronous massage which allow components to request functionality
    from another Android component.
    */
    private void switchActivity() {

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(Intent.EXTRA_COMPONENT_NAME,"http://www.vandal.com");
        startActivity(intent);
    }
}
