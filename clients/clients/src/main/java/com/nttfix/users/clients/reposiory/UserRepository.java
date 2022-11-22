package com.nttfix.users.clients.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttfix.users.clients.models.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, String>{


}
