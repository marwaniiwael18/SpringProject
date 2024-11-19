package com.example.foyer.Services;

import com.example.foyer.Repositories.BlocRepo;
import com.example.foyer.Repositories.ChambreRepo;
import com.example.foyer.entities.Bloc;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{

    private final ChambreRepo chambreRepo;
    BlocRepo blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(int idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc ajouterBlocEtChambresAssocie(Bloc bloc){
        Bloc bloc1 = blocRepository.save(bloc);
        bloc1.getChambres().forEach(chambre ->{
            chambre.setBloc(bloc1);
            chambreRepo.save(chambre);
        });
        return bloc1;
    }
    @Override
    public List<Bloc> getBlocByUniversite(int universite) {
        return blocRepository.findByFoyer_Universite_IdUniversite(universite);
    }

}
