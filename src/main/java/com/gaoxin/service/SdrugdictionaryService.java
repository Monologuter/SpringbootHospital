package com.gaoxin.service;

import com.gaoxin.entity.Area;
import com.gaoxin.entity.Sdrugdictionary;
import com.gaoxin.entity.Type;
import com.gaoxin.entity.Unit;
import com.gaoxin.mapper.SdrugdictionaryMapper;

import java.util.List;

public interface SdrugdictionaryService {
    List<SdrugdictionaryMapper> findAllSdrugdictionary(Sdrugdictionary sdrugdictionary);

    int addSdrugdictionary(Sdrugdictionary sdrugdictionary);

    int editSdrugdictionary(Sdrugdictionary sdrugdictionary);

    int deleteSdrugdictionary(Integer drugId);

    List<Unit> findAllUnit();

    List<Area> findAllArea();

    List<Type> findAllType();

    int count(Sdrugdictionary sdrugdictionary);
}
