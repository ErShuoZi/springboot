package com.furn.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.furn.bean.Furn;
import com.furn.service.FurnService;
import com.furn.util.Result;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FurnController {
    @Resource
    private FurnService furnService;

    //添加家具信息
    //如果前端是以表单形式提交,则不需要RequestBody 注解
    @PostMapping("/save")
    public Result save(@RequestBody Furn furn) {
        furnService.save(furn);
        return Result.success();
    }


    @PostMapping("/list")
    public Result list() {
        List<Furn> list = furnService.list();
        return Result.success(list);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Furn furn) {
        furnService.updateById(furn);
        return Result.success();
    }


    @PostMapping("/findById")
    public Result findById(@RequestBody String requestBody) throws JSONException {
        JSONObject jsonObject = new JSONObject(requestBody);
        String id = jsonObject.getString("id");
        Furn furn = furnService.getById(id);
//        requestBody
        return Result.success(furn);
    }


    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id) {
        furnService.removeById(id);
        return Result.success();
    }



    @PostMapping("/listFurnsByPage")
    public Result listFurnsByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                  @RequestParam(defaultValue = "5") Integer pageSize) {
        Page<Furn> page = furnService.page(new Page<>(pageNum, pageSize));
        return Result.success(page);
    }


}
