package com.alaa.logreg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.logreg.models.Library;
@Repository
public interface LibraryRepo extends CrudRepository<Library, Long> {

	List <Library> findAll();
}
