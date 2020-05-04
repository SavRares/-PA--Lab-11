package com.example.demo.controller;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(value = "/")
    public List<Player> getAllPlayers() {
        return playerService.findAll();
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdatePlayer(@RequestBody Player player) {
        playerService.saveOrUpdatePlayer(player);
        return new ResponseEntity("Player added successfully", HttpStatus.OK);
    }

}