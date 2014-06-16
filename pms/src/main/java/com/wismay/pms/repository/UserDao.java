package com.wismay.pms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.wismay.pms.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
