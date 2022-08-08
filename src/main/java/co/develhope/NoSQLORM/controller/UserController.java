package co.develhope.NoSQLORM.controller;

import co.develhope.NoSQLORM.entities.User;
import co.develhope.NoSQLORM.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("")
     public User createUser(@RequestBody User user){
        user.setId(null);
        return userService.save(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/count")
    public long count(){
        return userService.count();
    }

    @GetMapping("/{id}")
    public User getIdUser(@PathVariable String id ) throws Exception {
        Optional<User> user = userService.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            throw new Exception("User is not found");
        }
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user) throws Exception {
        if(!userService.existsById(id)) throw new Exception("User is not found");
        user.setId(id);
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
     public void deleteUser(@PathVariable String id){
        userService.deleteById(id);
    }

}
