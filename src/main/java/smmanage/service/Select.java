package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Goods;
@Service
public interface Select {
Goods selectservice(String name);
}
