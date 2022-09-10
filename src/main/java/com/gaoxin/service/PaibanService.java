package com.gaoxin.service;

import com.gaoxin.entity.Ban;
import com.gaoxin.entity.Paiban;

import java.util.List;

public interface PaibanService {
    List<Paiban> findAllPaiban(Paiban paiban);

    int editPaiban(Paiban paiban);

    List<Ban> findAllBan();

    int insertPaiban(Paiban paiban);

    int count(Integer Id);
}
