package com.tandon.Html_Form_Using_SpringBoot.repository;

import com.tandon.Html_Form_Using_SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
