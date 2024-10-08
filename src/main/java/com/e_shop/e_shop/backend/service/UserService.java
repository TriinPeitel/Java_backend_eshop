package com.e_shop.e_shop.backend.service;

import com.e_shop.e_shop.backend.api.model.RegistrationBody;
import com.e_shop.e_shop.backend.exception.UserAlreadyExistsException;
import com.e_shop.e_shop.backend.model.TeliaUser;
import com.e_shop.e_shop.backend.model.dao.LocalUserDAO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private LocalUserDAO localUserDAO;

    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }

    public TeliaUser registerUser( RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()
                || localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        TeliaUser user = new TeliaUser();
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setUsername(registrationBody.getUsername());
        user.setPassword(registrationBody.getPassword());
        user = localUserDAO.save(user);
        return user;
    }
}
