package com.example.demo.service;


public interface PlayerService {

    List<Player> findAll();

    void saveOrUpdatePlayer(Player player);

    void deletePlayer(Player id);

}