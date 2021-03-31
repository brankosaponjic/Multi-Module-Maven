package brankosaponjic.converters;

import brankosaponjic.domain.UserCommand;
import brankosaponjic.entities.User;
import brankosaponjic.entities.User.UserBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-31T23:14:07+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.firstName( userCommand.getFirstName() );
        user.lastName( userCommand.getLastName() );
        user.email( userCommand.getEmail() );

        return user.build();
    }
}
