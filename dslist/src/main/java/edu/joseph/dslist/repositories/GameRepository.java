package edu.joseph.dslist.repositories;

import edu.joseph.dslist.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
