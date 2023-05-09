package com.fanhuage.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fanhuage.common.R;
import com.fanhuage.domain.Flower;
import com.fanhuage.service.FlowerService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: fanhuage
 * @className: GoodsController
 * @version: 1.0
 * @description:
 * @author: LuoJie
 * @date: 2023-04-27 21:40
 */

@Slf4j
@RestController
// @RequestMapping("/fanhuage")
public class GoodsController {
    @Autowired
    private FlowerService flowerService;


    /**
     * @methodName: 分页查询所有鲜花
     * @description:
     * @Author: LuoJie
     * @param: null
     * @updateTime: 2023-04-30 13:45
     */
    @GetMapping("/goods")
    public R<IPage> goods(@RequestParam(value = "currentPage", defaultValue = "1") int page,
                          @RequestParam(value = "pageSize", defaultValue = "10") int size,
                          @RequestParam(value = "query", defaultValue = "") String query) {
        return flowerService.getPaginatedFlowers(page, size, query);

    }

    /*新增鲜花*/
    @PostMapping("/addflowers")
    public R<String> addGoods(@RequestBody Flower flower) {
        log.info("Flower:{}", flower);
        return flowerService.addFlower(flower);
    }

    /*删除鲜花*/
    @DeleteMapping("/deleteGoods")
    public R<String> delete(@RequestBody Long fid) {
        flowerService.remove(fid);
        return R.success("删除成功");
    }

    /*修改鲜花*/
    @PutMapping("/updateFlower")
    public R<String> updateFlower(@RequestBody Flower flower){
        flowerService.upFlowerById(flower);
        return R.success("商品信息修改成功");
    }
}
