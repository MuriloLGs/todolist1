package br.com.murilolourencato.todolist1.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;



public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);



    
}
