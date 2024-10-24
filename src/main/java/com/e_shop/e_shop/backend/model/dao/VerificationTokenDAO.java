package com.e_shop.e_shop.backend.model.dao;

import com.e_shop.e_shop.backend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
}
