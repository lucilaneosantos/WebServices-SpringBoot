package com.lucilaneosantos.webservicesspringboot.repositories;

import com.lucilaneosantos.webservicesspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
//JpaRepository é uma interface que já tem implementação padrão para acessar os dados
//UserRepository é uma interface que herda de JpaRepository
//User é a entidade que o JpaRepository vai gerenciar
//Long é o tipo do ID da entidade User

}
