package com.master.user.repository;

import com.master.user.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long>, ListPagingAndSortingRepository<User, Long> {

}
