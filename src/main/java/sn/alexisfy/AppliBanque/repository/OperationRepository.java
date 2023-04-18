package sn.alexisfy.AppliBanque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.alexisfy.AppliBanque.model.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {
	
	@Query("Select o from Operation o where o.compte.codeCompte=:x order by o.dateOperation desc")
	public List<Operation> listOperation(@Param("x") String codeCpte);

}
