package br.com.fiap.moneyminder.repository;

import org.springframework.data;

import br.com.fiap.moneyminder.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

    // public void cadastrar(Categoria categoria){}
    // public void update(Categoria categoria){}
    // public getById(Long id){}


}