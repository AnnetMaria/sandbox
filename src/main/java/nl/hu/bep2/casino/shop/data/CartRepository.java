package nl.hu.bep2.casino.shop.data;

import nl.hu.bep2.casino.shop.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class CartRepository {

    public Optional<Cart> findCartById(Long cartId) {
        return Optional.of(new Cart());
    }

    public void save(Cart cart) {
        System.out.println("Product list saved");
    }


}
