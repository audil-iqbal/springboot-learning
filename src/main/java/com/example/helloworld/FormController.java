package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    ClientsRepo repo;

    @GetMapping("/form")
    public String edureka(){
        return "edureka";
    }

    @RequestMapping("/details")
    public ModelAndView details(Clients clients){
        repo.save(clients);
        ModelAndView mv = new ModelAndView();
        mv.addObject("cid",clients.getCid());
        mv.addObject("cname",clients.getCname());
        mv.addObject("cemail",clients.getCemail());
        mv.setViewName("viewClients");
        return mv;
    }

    @GetMapping("/getdetails")
    public String getDetails(){
        return  "getDetail";
    }

    @PostMapping("/getdetails")
    public ModelAndView viewDetails(@RequestParam("cid") int cid){
        ModelAndView mv = new ModelAndView("retrieve");
        Clients client = repo.findById(cid).orElse(null);
        System.out.println(client);
        mv.addObject(client);
        return mv;
    }

    @RequestMapping("/clients")
    @ResponseBody
    public List<Clients> getClients(){
        return repo.findAll();
    }

    @RequestMapping("/clients/{cid}")
    @ResponseBody
    public Optional<Clients> getClients2(@PathVariable("cid") int cid){
        return repo.findById(cid);
    }

    @PostMapping("/clients")
    public String getCustomers3(@RequestBody Clients clients){
        repo.save(clients);
        return clients.toString();
    }

    @DeleteMapping("/clients/{cid}")
    public String deleteClient(@PathVariable("cid") int cid){
        try {
            repo.deleteById(cid);
            return "true";
        }catch (Exception c){
            return "false";
        }
    }

    @PutMapping(path = "/clients",consumes = {"application/json"})
    public Clients updateClients(@RequestBody Clients client){
        repo.save(client);
        System.out.println("update");
        return client;
    }
}
