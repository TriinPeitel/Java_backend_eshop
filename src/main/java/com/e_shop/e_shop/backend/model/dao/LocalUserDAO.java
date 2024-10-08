package com.e_shop.e_shop.backend.model.dao;

import com.e_shop.e_shop.backend.model.TeliaUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends CrudRepository<TeliaUser, Long> {
    Optional<TeliaUser> findByUsernameIgnoreCase(String username);
    Optional<TeliaUser> findByEmailIgnoreCase(String email);
}
