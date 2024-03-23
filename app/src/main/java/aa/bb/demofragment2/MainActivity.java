package aa.bb.demofragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnRecup, btnSup;
TextView txtTitre;
FragmentManager FM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRecup=findViewById(R.id.btnRecup);
        btnSup=findViewById(R.id.btnSup);
        txtTitre=findViewById(R.id.txtTitre);
        FM=getSupportFragmentManager();
        btnRecup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                F2Fragment F = (F2Fragment)FM.findFragmentById(R.id.F2);
               //récupération des données depuis fragment
                txtTitre.setText(String.valueOf(F.getPrixFromFragment()));

                //envoi de données
              //  F.afficher("ttt",67);

            }
        });
        btnSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Fragment F = FM.findFragmentById(R.id.F1);
                if (F != null) {
                    FragmentTransaction fragmentTransaction = FM.beginTransaction();

                    fragmentTransaction.remove(F);
                    fragmentTransaction.commit();
                }


            }
        });
    }
}