package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static HashMap<String, String> events = new HashMap<>();
    @GetMapping
    public String displayAllEvents(Model model) {
        /*List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple");
        events.add("SpringOne Platform");*/
        //model.addAttribute("title", "All Events");

        model.addAttribute("events", events);
        //events = new HashMap<>();
        events.put("Mentorship", "A fun meetup for connecting with mentors");
        events.put("Code With Pride", "A fun meetup sponsored by LaunchCode");
        events.put("Javascript", "An imaginary meetup for Javascript developers");
        return "events/index";
    }
    @GetMapping("create")
    public String renderCreateEventForm(Model model){
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

   /* @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }*/

}
