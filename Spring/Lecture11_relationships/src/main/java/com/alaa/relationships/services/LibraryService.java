package com.alaa.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alaa.relationships.models.Book;
import com.alaa.relationships.models.Library;
import com.alaa.relationships.repositories.LibraryRepo;

@Service
public class LibraryService {
	// === CRUD ===
	
		@Autowired
		private LibraryRepo libraryRepo;
		
		// READ ALL
		
		public List<Library> allLibs() {
			return libraryRepo.findAll();
		}
		
		
//		CREATE
		public Library createLibrary(Library l) {
			return libraryRepo.save(l);
		}
		
		
//		READ ONE
		public Library findLibrary(Long id) {
			Optional<Library> maybeLibrary = libraryRepo.findById(id);
			if (maybeLibrary.isPresent()) {
				return maybeLibrary.get();
			} else {
				return null;
			}
		}
		
//		UPDATE
		public Library updateLibary(Library l) {
			return libraryRepo.save(l);
		}
		
//		DELETE
		public void deleteLibrary(Long id) {
			libraryRepo.deleteById(id);
		}
	
}
