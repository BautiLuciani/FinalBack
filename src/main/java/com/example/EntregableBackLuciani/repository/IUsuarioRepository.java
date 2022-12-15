package com.example.EntregableBackLuciani.repository;

import com.example.EntregableBackLuciani.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("from usuario u where u.nombre = :nombre")
    Usuario getUserByNombre (@Param("nombre") String nombre);

}