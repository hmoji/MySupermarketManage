package smmanage.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
@Service
public interface QueryAllGoods {
	ArrayList<Goods> queryAllGoods();
}
