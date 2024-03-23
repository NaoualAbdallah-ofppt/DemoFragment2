package aa.bb.demofragment2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class F1Fragment extends Fragment {
ListView LV;
Button btn;
TextView txt;

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
           //Cast obligatoire
            F2Fragment F2 = (F2Fragment) getParentFragmentManager().
                    findFragmentById(R.id.F2);

            //Récupération de la position de l'élément choisi
            Produit P = Produit.getLstProduit().get(i);
            //envoi des données au fragment
            F2.afficher(P.getNom(),P.getPrix());


        }
    });
        return  V;
   }

    // pour être sûr que l'activité a été créée avant d'essayer d'accéder
    //  à ses view, utiliser la méthode onViewCreated()
    // . Vous pouvez ensuite utiliser getActivity().findViewById()
    // pour obtenir la vue
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn=view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             txt=(TextView) getActivity().findViewById(R.id.txtTitre);
             txt.setText("Bonjour");

            }
        });

        }
}