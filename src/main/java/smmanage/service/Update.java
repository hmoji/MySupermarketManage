package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
@Service
public interface Update {
	boolean update(Goods goods);
}
