package com.cruz.apph2.service;


import com.cruz.apph2.model.User;
import com.cruz.apph2.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;






@Service
@AllArgsConstructor
public  class UserServiceImpl implements  UserService{

    private final UserRepository userRepository;

    @Override
    public User saveUserId(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long idUser) {
        return userRepository.findById(idUser).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public User updateUser(Long id, User updateToUser) {
        User searchedUser = userRepository.findById(id).get();


        return userRepository.save(searchedUser);
    }

    @Override
    public boolean deleteUser(Long id) {
        try{
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
