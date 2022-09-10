package com.gaoxin.service;

import com.gaoxin.entity.Area;

import java.util.List;

public interface AreaService {
    /*
     * 地区的增删改查
     * */
    List<Area> findAllArea(Area area);

    int deleteArea(Integer areaId);

    int addArea(Area area);

    int count(Area area);
}