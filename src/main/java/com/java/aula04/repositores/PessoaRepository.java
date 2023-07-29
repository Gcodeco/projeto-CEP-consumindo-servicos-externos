package com.java.aula04.repositores;


import com.java.aula04.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository  extends JpaRepository <Pessoa, Long> {


    @Query("select p from Pessoa p where p.aitovo = : ativo")
    List<Pessoa> findAll(@Param("ativo") Boolean ativo);

}


