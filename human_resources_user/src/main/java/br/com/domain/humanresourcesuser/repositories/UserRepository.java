package br.com.domain.humanresourcesuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.domain.humanresourcesuser.model.User;

/**
 * User repository interface.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
