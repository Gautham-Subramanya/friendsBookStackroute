package com.stackroute.friendsBookStackroute.repository;


import com.stackroute.friendsBookStackroute.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataNeo4jTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    User user;

    @Before
    public void setUp(){

        user = new User();
        user.setAddress("Bangalore");
        user.setContactNo("987654321");
        user.setEmail("a@gmail.com");
        //user.setId(2345L);
        user.setName("a");
        user.setUserProfileImageUrl("\"https://www.google.com/search?q=google+images&client=ubuntu&hs=5bQ&channel=fs&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi27qPnxq3eAhWFto8KHa_FBesQ_AUIDigB&biw=1366&bih=639#imgrc=faVYp-YX1tMUxM:\"");

    }


    @After
    public void tearDown(){
        userRepository.deleteAll();
    }


    @Test
    public void testGetAllUsers(){

        userRepository.save(user);

        List<User> list = userRepository.getAllUsers();
        Assert.assertEquals("a@gmail.com",list.get(0).getEmail());

    }


    @Test
    public void testGetAllUsersFailure(){

       userRepository.save(user);

        List<User> list = userRepository.getAllUsers();
        Assert.assertNotEquals("abd@gmail.com",list.get(0).getEmail());

    }



}
