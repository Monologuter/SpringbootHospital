package com.gaoxin.service;

import com.gaoxin.entity.Lrecord;
import com.gaoxin.entity.Pay;
import com.gaoxin.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);

    int addPay(Register register);

    List<Pay> selPays(Register register);

    List<Lrecord> selSurplus(Lrecord lrecord);
}
