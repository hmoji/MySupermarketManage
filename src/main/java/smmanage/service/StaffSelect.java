package smmanage.service;

import org.springframework.stereotype.Service;

import smmanage.entity.Staff;
@Service
public interface StaffSelect {
Staff staffselectservice(String name);
}
