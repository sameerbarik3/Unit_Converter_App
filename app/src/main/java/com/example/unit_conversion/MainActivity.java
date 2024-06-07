package com.example.unit_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView text2;
    EditText editText;
    Button button;
    double kilos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        text2=findViewById(R.id.text2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting the User input (kilos)
                String inputText =editText.getText().toString();
                //conversion a string into double
                double kilos= Double.parseDouble(inputText);
                //Converting kilos into pounds
                double pounds = makeConversion(kilos);
                //Displaying the conversion result
                text2.setText(""+pounds);

            }
        });
    }

    public double makeConversion(double kilos){
        //1 Kilo =2.20462;
        return kilos*2.204462 ;
    }
}