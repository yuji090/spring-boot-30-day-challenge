package com.example.userApi.Controller;

import com.example.userApi.Model.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    ArrayList<User> users = new ArrayList<>();

    @GetMapping("/display")
    public List<User> show(){
        return users;
    }

    @GetMapping("/display/{id}")
    public User getuserbyid(@PathVariable int id){
        for(User u: users){
            if(u.getId()==id){
                return u;
            }
        }
        return null;
    }

    //post
    @PostMapping("/add")
    public List<User> add(@RequestBody @Valid User user){
        users.add(user);
        return users;

    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id ,@RequestBody User user){
        for(User u: users){
            if(u.getId()==id){
                if(user.getId() !=0 ) {
                    u.setId(user.getId());
                }
                if(user.getName() != null){
                    u.setName(user.getName());
                }
                if(user.getEmail() != null){
                    u.setEmail(user.getEmail());
                }



            }
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        boolean removed = users.removeIf(u -> u.getId() == id);
        if (removed) {
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }


}
