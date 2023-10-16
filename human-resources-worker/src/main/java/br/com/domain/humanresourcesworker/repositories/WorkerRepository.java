package br.com.domain.humanresourcesworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.domain.humanresourcesworker.model.Worker;

/**
 * Worker repository class.
 *
 * @author Eduardo Isidoro Gonçalves.
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
