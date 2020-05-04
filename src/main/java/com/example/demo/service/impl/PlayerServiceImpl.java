package com.example.demo.service.impl;


@Service
public class PlayertServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public void saveOrUpdatePlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public void deletePlayer(String id) {
        playerRepository.deleteById(id);
    }
}