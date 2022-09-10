package com.gaoxin.service.Impl;

import com.gaoxin.entity.Litem;
import com.gaoxin.mapper.LitemMapper;
import com.gaoxin.service.LitemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class LitemServiceImpl implements LitemService {

    @Resource
    private LitemMapper litemMapper;

    @Override
    public List<Litem> selItems(Litem litem) {
        return litemMapper.selItems(litem);
    }

}
