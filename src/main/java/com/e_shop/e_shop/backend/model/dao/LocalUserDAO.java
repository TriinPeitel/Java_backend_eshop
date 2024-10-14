package com.e_shop.e_shop.backend.model.dao;

import com.e_shop.e_shop.backend.model.TeliaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface LocalUserDAO extends ListCrudRepository<TeliaUser, Long> {
    Optional<TeliaUser> findByUsernameIgnoreCase(String username);
    Optional<TeliaUser> findByEmailIgnoreCase(String email);
}
