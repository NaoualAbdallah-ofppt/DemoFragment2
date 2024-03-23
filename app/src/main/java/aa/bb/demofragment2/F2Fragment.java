package aa.bb.demofragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F2Fragment extends Fragment {
TextView txtNom;
TextView txtPrix;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V= inflater.inflate(R.layout.fragment_f2, container, false);
    txtNom=V.findViewById(R.id.txtNom);
        txtPrix=V.findViewById(R.id.txtPrix);

    return V;
    }
    public void afficher(String nom, double prix)
    {
        txtNom.setText(nom);
        txtPrix.setText(String.valueOf(prix));
    }
    public double getPrixFromFragment()
    {

        if (txtPrix.getText().toString() == "")
            return 0.0;
        return Double.parseDouble(txtPrix.getText().toString());
    }
}