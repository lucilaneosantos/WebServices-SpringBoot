package com.lucilaneosantos.webservicesspringboot.resources;

import com.lucilaneosantos.webservicesspringboot.entities.User;
import com.lucilaneosantos.webservicesspringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService service;
    //ResponseEntity é um tipo específico do Spring para retornar respostas de requisições web
    //o tipo do corpo da resposta vai ser User
    //o nome do método vai ser findAll
    //o método vai acessar o serviço UserService
    //o método vai retornar uma resposta de sucesso do HTTP com o corpo preenchido com a lista de usuários
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    //expõe um endpoint para acessar os usuários por id
    //o id do usuário vai vir na URL
    //para que o Spring aceite o id na URL, é preciso colocar a anotação @PathVariable
    //o tipo do id é Long
    //o método findById vai chamar o método findById da classe UserService
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById( @PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
