package com.messages.controller;

import com.messages.data.Messages;
import com.messages.repository.MessagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by WagnerMestrinho on 2/9/17.
 */
@Controller
public class MessagesController {

    @Autowired
    MessagesRepo messagesRepo;

    @RequestMapping(path = "/secure/message/create", method = RequestMethod.POST)
    public String createMessage(Model dataToJsp,
                             @RequestParam String author,
                              @RequestParam String content){

        Messages tmp = new Messages(author, content);

        messagesRepo.save(tmp);
        //if saved add message
        if(tmp.getId()>0) {
            dataToJsp.addAttribute("msg_success",
                    String.format( "%s you're Great" , author));
        }
        return "/secure/write";
    }



    @RequestMapping(path = "/secure/messages")
    public String listMessages(Model xyz){
        String destination = "wall";
        Iterable found = messagesRepo.findAll();

        // convert to lists because i like them
        Iterator<Messages> itr = found.iterator();
        List<Messages> data = new ArrayList();
        while(itr.hasNext()){
            data.add(itr.next());
        }

        // put list into model
        xyz.addAttribute("mList", data);

        // go to jsp
        return destination;
    }
}
