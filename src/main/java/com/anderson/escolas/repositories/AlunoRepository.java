package com.anderson.escolas.repositories;
import com.anderson.escolas.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
	
	boolean existsByNrCpf(String nrCpf);
	boolean existsByNrRm(String nrRm);

}
