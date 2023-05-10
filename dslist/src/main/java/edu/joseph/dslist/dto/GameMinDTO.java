package edu.joseph.dslist.dto;


import edu.joseph.dslist.model.Game;

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

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public Double getScore() {
        return score;
    }
}