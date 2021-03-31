package brankosaponjic.controllers;

import brankosaponjic.converters.UserMapper;
import brankosaponjic.domain.UserCommand;
import brankosaponjic.entities.User;

public class UserController {

    User saveUser(UserCommand command) {
        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
