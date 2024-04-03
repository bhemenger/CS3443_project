package utsa.edu.UTSA_Maps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.ComponentActivity;

public class Activity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template);
        buttonSetter();
    }

    private void buttonSetter() {
        Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "oop", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
