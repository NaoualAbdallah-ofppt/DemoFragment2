package aa.bb.demofragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class F1Fragment extends Fragment {
ListView LV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V= inflater.inflate(R.layout.fragment_f1, container, false);
    LV = V.findViewById(R.id.LV);
        ArrayAdapter aa = new ArrayAdapter(getActivity()
        , android.R.layout.simple_list_item_1,
                Produit.getLstProduit());
    LV.setAdapter(aa);
    LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            F2Fragment F = (F2Fragment) getParentFragmentManager().
                    findFragmentById(R.id.F2);
            //Récupération de la position de l'élément choisi
            Produit P = Produit.getLstProduit().get(i);
            //envoi des données au fragment
            F.afficher(P.getNom(),P.getPrix());

        }
    });



        return  V;


    }

}