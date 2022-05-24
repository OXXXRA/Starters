package com.starters.main.startups;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StartupsService {
    private static StartupsRepository startupsRepository;
    private static Startups checkExistStartup(long id) {
        Optional<Startups> startup = startupsRepository.findById(id);
        if (!startup.isPresent()) return null;
        return startup.get();
    }
    public StartupsService(StartupsRepository startupsRepository) {
        this.startupsRepository = startupsRepository;
    }

    public static Startups save(Startups startup) {
        return startupsRepository.save(startup);
    }

    public static List<Startups> getAll() {
        return startupsRepository.findAll();
    }

    public static Startups getById(long id) {
        Optional<Startups> startup = startupsRepository.findById(id);
        if (startup.isPresent()) return startup.get();
        return null;
    }

    public static boolean remove(long id) {
        if (checkExistStartup(id) == null) return false;
        startupsRepository.deleteById(id);
        return true;
    }
    public static Startups updateById(long id, Startups startup) {
        final Startups existStartup = checkExistStartup(id);
        if (existStartup == null) return null;
        existStartup.setAuthors(startup.getAuthors());
        existStartup.setComments_id(startup.getComments_id());
        existStartup.setContent(startup.getContent());
        existStartup.setRating(startup.getRating());
        existStartup.setName(startup.getName());
        existStartup.setJobs(startup.getJobs());
        existStartup.setStatus(startup.getStatus());
        startupsRepository.save(existStartup);
        return existStartup;
    }
}