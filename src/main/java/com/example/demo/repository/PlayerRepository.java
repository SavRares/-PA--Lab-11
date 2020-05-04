package com.example.demo.repository;

public interface PlayerRepository extends MongoRepository<Player, String> {
    List<Player> findAllByName();
}