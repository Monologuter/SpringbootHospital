package com.gaoxin.service.Impl;

import com.gaoxin.entity.Finance;
import com.gaoxin.entity.SdoctorDuibi;
import com.gaoxin.entity.currentFinance;
import com.gaoxin.mapper.FinanceMapper;
import com.gaoxin.service.FinanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {
    @Resource
    private FinanceMapper FinanceMapper;

    @Override
    public List<Double> reportYearFinance(String year) {
        return FinanceMapper.reportYearFinance(year);
    }

    @Override
    public List<Finance> reportYearBingFinance() {
        return FinanceMapper.reportYearBingFinance();
    }

    @Override
    public List<Double> zhuYuanYearFinance(String year) {
        return FinanceMapper.zhuYuanYearFinance(year);
    }

    @Override
    public List<Finance> zhuYuanYearBingFinance() {
        return FinanceMapper.zhuYuanYearBingFinance();
    }

    @Override
    public List<SdoctorDuibi> doctorDuibi(SdoctorDuibi sdoctorDuibi) {
        return FinanceMapper.doctorDuibi(sdoctorDuibi);
    }

    @Override
    public List<SdoctorDuibi> zDoctorDuibi(SdoctorDuibi sdoctorDuibi) {
        return FinanceMapper.zDoctorDuibi(sdoctorDuibi);
    }

    @Override
    public List<currentFinance> currentFinance(String current) {
        return FinanceMapper.currentFinance(current);
    }
}
