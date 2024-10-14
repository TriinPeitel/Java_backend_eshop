package com.e_shop.e_shop.backend.model.dao;

import com.e_shop.e_shop.backend.model.TeliaOrder;
import com.e_shop.e_shop.backend.model.TeliaUser;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<TeliaOrder, Long> {
    List<TeliaOrder> findByUser(TeliaUser user);
}