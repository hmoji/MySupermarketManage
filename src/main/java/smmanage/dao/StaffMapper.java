package smmanage.dao;

import org.springframework.stereotype.Repository;

import smmanage.entity.Staff;

@Repository
public interface StaffMapper {
	public Staff staffselect(String name);
}