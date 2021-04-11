package fr.koparthur.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    Intent intent;
    TextView result;
    EditText nb1;
    EditText nb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.textViewResult);
        nb1 = findViewById(R.id.editText1);
        nb2 = findViewById(R.id.editText2);
    }

    public void clickOnButton(View view) {
try {


        if (view.getId() == R.id.buttonplus) {
            double fnb1 = Double.valueOf(nb1.getText().toString()).doubleValue();
            double fnb2 = Double.valueOf(nb2.getText().toString()).doubleValue();
            double r = fnb1 + fnb2;

            String Result = String.valueOf(r);

            result.setText(fnb1 + " \u002B " + fnb2 + " \u003D " + Result);
        } else if (view.getId() == R.id.buttonmoins) {
            double fnb1 = Double.valueOf(nb1.getText().toString()).doubleValue();
            double fnb2 = Double.valueOf(nb2.getText().toString()).doubleValue();
            double r = fnb1 - fnb2;

            String Result = String.valueOf(r);

            result.setText(fnb1 + " \u2212 " + fnb2 + " \u003D " + Result);
        } else if (view.getId() == R.id.buttonfois) {
            double fnb1 = Double.valueOf(nb1.getText().toString()).doubleValue();
            double fnb2 = Double.valueOf(nb2.getText().toString()).doubleValue();
            double r = fnb1 * fnb2;

            String Result = String.valueOf(r);

            result.setText(fnb1 + " \u00D7 " + fnb2 + " \u003D " + Result);
        } else if (view.getId() == R.id.buttondiv) {
            double fnb1 = Double.valueOf(nb1.getText().toString()).doubleValue();
            double fnb2 = Double.valueOf(nb2.getText().toString()).doubleValue();
            double r = fnb1 / fnb2;

            String Result = String.valueOf(r);

            result.setText(fnb1 + " \u00F7 " + fnb2 + " \u003D " + Result);

        }

        }
    catch (NumberFormatException e) {
    Toast.makeText(this, R.string.pbNbTextToast, Toast.LENGTH_LONG).show();
    e.printStackTrace();}
    }

    public void onClickView(View view) {
        try {
        FloatingActionButton myFAB = findViewById(R.id.floatingActionButton);
        intent = new Intent(this, MP_Activity.class);
        startActivity(intent);
        }
        catch (Exception e) {
            Toast.makeText(this, R.string.pbChangeActivity, Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}