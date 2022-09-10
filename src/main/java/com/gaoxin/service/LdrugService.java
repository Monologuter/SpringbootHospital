package com.gaoxin.service;

import com.gaoxin.entity.Lpharmacy;
import com.gaoxin.entity.Lrecord;

import java.util.List;

public interface LdrugService {

    List<Lpharmacy> selDrug(Lpharmacy lpharmacy);

    List<Lrecord> selDrugs(Lrecord lrecord);

    int addDrug(Lrecord lrecord);

    int updDrug(Lrecord lrecord);

    int delDrug(Lrecord lrecord);

    int updDrugs(Lrecord lrecord);

    int updNum(Lrecord lrecord);

    int upd(Lrecord lrecord);
}
