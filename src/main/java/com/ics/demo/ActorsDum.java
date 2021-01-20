//package com.ics.demo;
//
//import com.ics.demo.models.Actor;
//import com.ics.demo.repositories.ActorRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ActorsDum implements CommandLineRunner {
//
//
//    private final ActorRepository actorRepository;
//
//    public ActorsDum(ActorRepository actorRepository) {
//        this.actorRepository = actorRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Actor actor = new Actor("Will Smith");
//
//        Actor actor2 = new Actor("Martin Lawrence");
//
//        actorRepository.save(actor);
//        actorRepository.save(actor2);
//    }
//}
