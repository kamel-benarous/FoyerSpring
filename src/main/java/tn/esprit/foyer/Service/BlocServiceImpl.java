package tn.esprit.foyer.Service;

import tn.esprit.foyer.Repository.BlocRepository;

public class BlocServiceImpl implements IBlocService{

    private final BlocRepository blocRepository;

    public BlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }
}

