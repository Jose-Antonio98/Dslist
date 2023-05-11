package edu.joseph.dslist.dto;


import edu.joseph.dslist.model.Game;
import edu.joseph.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private Double score;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.genre = entity.getGenre();
        this.score = entity.getScore();
    }

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public Double getScore() {
        return score;
    }
}
