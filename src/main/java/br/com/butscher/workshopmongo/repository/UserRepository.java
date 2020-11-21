package br.com.butscher.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.butscher.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
