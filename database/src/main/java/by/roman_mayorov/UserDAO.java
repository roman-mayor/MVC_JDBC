package by.roman_mayorov;

import java.util.Optional;

public class UserDAO {

    public Optional<User> findById(Long id){
        User user = new User();
        user.setUsername("Роман");
        return Optional.of(user);
    }
}
