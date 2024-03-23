package aa.bb.demofragment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnRecup;
TextView txtTitre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRecup=findViewById(R.id.btnRecup);
        txtTitre=findViewById(R.id.txtTitre);
        btnRecup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                F2Fragment F = (F2Fragment) getSupportFragmentManager().
                        findFragmentById(R.id.F2);
               //récupération des données depuis fragment
                txtTitre.setText(String.valueOf(F.getPrixFromFragment()));

            }
        });
    }
}