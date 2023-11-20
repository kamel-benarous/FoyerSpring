package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Bloc;
import tn.esprit.foyer.Entity.Chambre;
import tn.esprit.foyer.Entity.TypeChambre;
import tn.esprit.foyer.Repository.BlocRepository;
import tn.esprit.foyer.Repository.ChambreRepository;


import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl  implements IChambreService {
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {

        Bloc bloc = blocRepository.findBlocByNomBloc(nomBloc);

        if (bloc != null) {
            return  bloc.getChambre();
        } else {
            return null;
        }
    }

    @Override
    public long nbrChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();

        if (bloc != null) {
            return bloc.getChambre().stream()
                    .filter(chambre -> chambre.getTypeChambre() == type)
                    .count();
        } else {
            return 0;
        }
    }
}