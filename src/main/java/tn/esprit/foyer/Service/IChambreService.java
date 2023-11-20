package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Chambre;
import tn.esprit.foyer.Entity.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
     List<Chambre> getChambresParNomBloc (String nomBloc );
     long nbrChambreParTypeEtBloc(TypeChambre type, long idBloc );
}
