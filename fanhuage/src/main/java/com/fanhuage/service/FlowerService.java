package com.fanhuage.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fanhuage.common.R;
import com.fanhuage.domain.Flower;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 71439
* @description 针对表【flower】的数据库操作Service
* @createDate 2023-04-27 03:40:53
*/
public interface FlowerService extends IService<Flower> {

     R<IPage> getPaginatedFlowers(int page, int size, String query);


    R<String> addFlower(Flower flower);

    void remove (Long id);

    R<String> upFlowerById(Flower flower);
}
