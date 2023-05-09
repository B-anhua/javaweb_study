package com.fanhuage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanhuage.common.R;
import com.fanhuage.domain.Flower;
import com.fanhuage.mapper.FlowerMapper;
import com.fanhuage.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 71439
 * @description 针对表【flower】的数据库操作Service实现
 * @createDate 2023-04-27 03:40:53
 */
@Service
public class FlowerServiceImpl extends ServiceImpl<FlowerMapper, Flower> implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;


    /**
     * @methodName: getPaginatedFlowers
     * @description: 分页查询所有鲜花
     * @Author: LuoJie
     * @param: page
     * @param: size
     * @param: query
     * @updateTime: 2023-04-30 13:43
     * @return: java.util.List<com.fanhuage.domain.Flower>
     */
    @Override
    public R<IPage> getPaginatedFlowers(int page, int size, String query) {
        //
        int offset = page;
        // int offset = (page - 1) * size;

        int limit = size;

        LambdaQueryWrapper<Flower> queryWrapper = new LambdaQueryWrapper<>();
        if (!query.isEmpty()) {
            queryWrapper.like(Flower::getFid, query)
                    .or()
                    .like(Flower::getFname, query)
                    .or()
                    .like(Flower::getFstatus, query);
        }


        // Page pageObj = new Page(page, size);
        // pageObj = this.page(pageObj, queryWrapper);

        IPage pageObj = new Page(offset, limit);
        pageObj = flowerMapper.selectPage(pageObj, queryWrapper);

        return R.success(pageObj);
    }

    /**
     * @methodName: getStringR
     * @description: 新增鲜花
     * @Author: LuoJie
     * @param: flower
     * @updateTime: 2023-04-30 13:41
     * @return: com.fanhuage.common.R<java.lang.String>
     */
    @Override
    public R<String> addFlower(Flower flower) {
        LambdaQueryWrapper<Flower> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(Flower::getFid, flower.getFid());
        List<Flower> flowers = flowerMapper.selectList(queryWrapper);
        System.out.println("=================");
        System.out.println(flowers);
        if (!flowers.isEmpty()) {
            return R.error("鲜花已存在");
        }
        flowerMapper.insert(flower);
        return R.success("新增分类成功");

    }


    /**
     * @methodName: remove
     * @description: 删除鲜花
     * @Author: LuoJie
     * @param: id
     * @updateTime: 2023-04-30 13:43
     */
    @Override
    public void remove(Long id) {
        flowerMapper.deleteById(id);
    }

    @Override
    public R<String> upFlowerById(Flower flower) {
        flowerMapper.updateById(flower);
        return null;
    }
}




