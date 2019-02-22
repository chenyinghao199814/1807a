package com.jk.service.ardess;


import com.jk.bean.Ardess;
import com.jk.mapper.ardess.ArdessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArdessServiceimpl  implements ArdessService {
    @Autowired
    private ArdessMapper ardessMapper;


    @Override
    public List<Ardess> queryArdess() {
        return ardessMapper.queryArdess();
    }
}
