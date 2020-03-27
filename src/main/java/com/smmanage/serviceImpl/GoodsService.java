package com.smmanage.serviceImpl;

import com.smmanage.bean.Goods;
import com.smmanage.mapper.GoodsMapper;
import com.smmanage.service.IGoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hmoji
 * @since 2020-03-27
 */
@Service
public class GoodsService extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
