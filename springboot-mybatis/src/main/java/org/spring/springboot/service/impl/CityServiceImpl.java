package org.spring.springboot.service.impl;

import dao.CityMapper;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.CityExample;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityDao;

    public List<City> findCityByName(String cityName) {
        CityExample CityExample=new CityExample();
        CityExample.createCriteria().andCityNameEqualTo(cityName);
        return cityDao.selectByExample(CityExample);
    }

}
