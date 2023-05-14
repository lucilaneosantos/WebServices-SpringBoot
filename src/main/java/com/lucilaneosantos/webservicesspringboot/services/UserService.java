package com.lucilaneosantos.webservicesspringboot.services;

import com.lucilaneosantos.webservicesspringboot.entities.User;
import com.lucilaneosantos.webservicesspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //registra a classe como componente do Spring e permite que seja injetado com o @Autowired
public class UserService {

    @Autowired
    private UserRepository repository;
    //injeção de dependência automática do Spring
    //UserService depende de UserRepository
    //UserService vai ter uma dependência com UserRepository
    //UserService vai ter um objeto do tipo UserRepository
    //UserService vai ter um mecanismo de injeção de dependência resolvendo a dependência com UserRepository
    //UserService não vai precisar instanciar o UserRepository
    //UserService não vai precisar fazer new UserRepository para instanciar o UserRepository
    public List<User> findAll(){
        return repository.findAll();
    }
  //Optional é um container que vai carregar o objeto do tipo User que encapsula o retorno do findById
        public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
        }
}
