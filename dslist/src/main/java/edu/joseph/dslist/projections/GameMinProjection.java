package edu.joseph.dslist.projections;

import edu.joseph.dslist.model.Game;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
