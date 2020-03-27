package com.smmanage.serviceImpl;

import com.smmanage.bean.Staff;
import com.smmanage.mapper.StaffMapper;
import com.smmanage.service.IStaffService;
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
public class StaffService extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
