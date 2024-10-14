package com.e_shop.e_shop.backend.service;

import com.e_shop.e_shop.backend.model.TeliaOrder;
import com.e_shop.e_shop.backend.model.TeliaUser;
import com.e_shop.e_shop.backend.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<TeliaOrder> getOrders(TeliaUser user) {
        return webOrderDAO.findByUser(user);
    }
}
