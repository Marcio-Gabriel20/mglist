package com.marcio.mglist.projections;

public interface GameMinProjection {
    
    // Inserir métodos get() para cada dado que a consulta SQL(que está na GameRepository) está retornando
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}