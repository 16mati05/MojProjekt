package com.example.a16mat.podstwayprogramowania;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    TextView tek1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematyka);

        final List<String> list = new ArrayList<>();

        b1 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.editText);
        tek1 = (TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                list.add(e1.getText().toString());
                Log.d("Tablica:", String.valueOf(list));
                tek1.setText(String.valueOf(list));
            }
        });
//        for (int i = 0; i < list.length; i++) {
//            Log.d("Tablica", tablica[i]);
//        }

    }
}