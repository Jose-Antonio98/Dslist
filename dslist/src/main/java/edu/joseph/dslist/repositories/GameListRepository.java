package edu.joseph.dslist.repositories;

import edu.joseph.dslist.model.Game;
import edu.joseph.dslist.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
