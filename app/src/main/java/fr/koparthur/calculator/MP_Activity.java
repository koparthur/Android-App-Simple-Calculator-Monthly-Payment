package fr.koparthur.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class MP_Activity extends AppCompatActivity {

    EditText capital, taux, duree;
    TextView result;
    Intent intentMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mp_activity);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void clickOn (View view){
        try {


            capital = findViewById(R.id.capitalId);
            taux = findViewById(R.id.tauxId);
            duree = findViewById(R.id.dureeId);
            result = findViewById(R.id.resultId);

            double cd = Double.valueOf(capital.getText().toString()).doubleValue();
            double td = Double.valueOf(taux.getText().toString()).doubleValue();
            double dd = Double.valueOf(duree.getText().toString()).doubleValue();

            Credit credit = new Credit (cd, dd,td/100);

            NumberFormat nbf = NumberFormat.getCurrencyInstance(Locale.getDefault());
            String r = nbf.format(credit.getM());

            result.setText(r);


        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.pbNbTextToast, Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void onClickView2(View view) {
        try {
            //FloatingActionButton myFAB2 = findViewById(R.id.floatingActionButtonMP);
            //intentMP = new Intent(getApplicationContext(), MainActivity.class);
            Intent i=new Intent(MP_Activity.this, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);

        }
        catch (Exception e) {
            Toast.makeText(this, R.string.pbChangeActivity, Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}