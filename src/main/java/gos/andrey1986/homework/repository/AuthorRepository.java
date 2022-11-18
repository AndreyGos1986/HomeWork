package gos.andrey1986.homework.repository;

import gos.andrey1986.homework.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author,Long> {
}
