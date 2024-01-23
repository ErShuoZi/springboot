package com.furn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.furn.bean.Furn;
import org.apache.ibatis.annotations.Mapper;

//如果是mybatis plus FurnMapper接口可以通过继承 父接口 baseMapper<Furn>
//扩展功能
//可以通过@Mapper 注解标识将该接口扫入,也可在主程序中通过@MapperScan注解标识要扫描的包
public interface FurnMapper extends BaseMapper<Furn> {
    //如果有其他方法,可以在该接口声明
    //并且在对应的Mapper.xml实现即可
}
