package com.cruz.apph2.controller;



import com.cruz.apph2.model.User;
import com.cruz.apph2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

        @PostMapping
        public ResponseEntity saveUserId(@RequestBody User user){
            return new ResponseEntity<>(userService.saveUserId(user), HttpStatus.CREATED);
        }


    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable("id") Long idUser) {
        return new ResponseEntity(userService.getUser(idUser), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable("id") Long idUser, @RequestBody User user) {
        return new ResponseEntity(userService.updateUser(idUser, user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") Long idUser) {
        boolean response = userService.deleteUser(idUser);

        if (response == true){
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }




}