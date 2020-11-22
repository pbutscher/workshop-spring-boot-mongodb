package br.com.butscher.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.butscher.workshopmongo.domain.Post;
import br.com.butscher.workshopmongo.repository.PostRepository;
import br.com.butscher.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post post = repo.findById(id).get();	
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return post;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
		// return repo.findByTitleContainingIgnoreCase(text);
	}
}
