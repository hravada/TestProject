package com.jpmc.fetchdatapublishqueue.service;

import com.jpmc.fetchdatapublishqueue.entity.NgTravelUser;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NgTravelUserService {
    public List<NgTravelUser> getUserList(){
        return Arrays.asList(new NgTravelUser(100,"Hari","harikrishna@chase.com"),
                             new NgTravelUser(101,"ravada","ravada@chase.com"),
                             new NgTravelUser(102,"krishna","krish@chase.com")
                );
    }
}
