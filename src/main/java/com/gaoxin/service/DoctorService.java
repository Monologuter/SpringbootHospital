package com.gaoxin.service;

import com.gaoxin.entity.Departments;
import com.gaoxin.entity.Doctor;
import com.gaoxin.entity.Registeredtype;

import java.util.List;

public interface DoctorService {
    /*
     * 医生的增删改查
     * */
    List<Doctor> doctorList(Doctor doctor);

    int deleteDoctor(Integer doctorId);

    int addDoctor(Doctor doctor);

    int editDoctor(Doctor doctor);

    List<Departments> findAllDepartments();

    List<Registeredtype> findAllRegisteredtype();

    int count(Doctor doctor);

    /*
     * 判断该医生是否还有病人
     * */
    int checkCount(Integer doctorId);
}
