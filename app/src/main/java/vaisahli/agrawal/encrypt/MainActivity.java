package vaisahli.agrawal.encrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    int i=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pass1 = new String("vaishali");
                    String pass = editText.getText().toString();
                    if (pass.equals(pass1))
                    {
                        textView.setText("welcome!!!\n ");

                    }
                    else
                        {
                            pass = editText.getText().toString();
                        textView.setText("Warning!!! \n attempt left: " + i);
                        i = i-1;
                        if (i == 0)
                        {
                            button.setEnabled(false);
                            textView.setText("sorry");
                        }
                    }



            }







        });

    }
}
