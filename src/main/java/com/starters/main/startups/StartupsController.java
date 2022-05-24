package com.starters.main.startups;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/startups")
public class StartupsController {
    private StartupsService startupsService;

    public  StartupsController(StartupsService startupsService) {
        this.startupsService = startupsService;
    }

    @PostMapping()
    public ResponseEntity<Startups> saveStartup(@RequestBody  Startups startup) {
        return new ResponseEntity<Startups>(StartupsService.save(startup), HttpStatus.CREATED);
    }

    @GetMapping()
    public List <Startups> getAllStartups() {
        return StartupsService.getAll();
    }
    @GetMapping("{id}")
    public ResponseEntity<Startups> getStartupsByID(@PathVariable("id") long id) {
        return new ResponseEntity<Startups>(StartupsService.getById(id), HttpStatus.OK);
    };
    @DeleteMapping("{id}")
    public boolean deleteStartupsByID(@PathVariable("id") long id) {
        return StartupsService.remove(id);
    }
    @PutMapping("{id}")
    public ResponseEntity<Startups> updateStartupsByID(@PathVariable("id") long id, @RequestBody Startups startup) {
        return new ResponseEntity<Startups>(StartupsService.updateById(id, startup), HttpStatus.ACCEPTED);
    }
}