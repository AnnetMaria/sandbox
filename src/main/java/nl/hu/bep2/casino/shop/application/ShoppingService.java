package nl.hu.bep2.casino.shop.application;

import nl.hu.bep2.casino.shop.data.CartRepository;
import nl.hu.bep2.casino.shop.domain.Cart;
import nl.hu.bep2.casino.shop.domain.CartNotFoundException;
import nl.hu.bep2.casino.shop.domain.LineItem;
import nl.hu.bep2.casino.shop.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {
    private final CartRepository cartRepository;

    public ShoppingService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addProductToCart(
            Long cartId, Product product) {

        Cart cart = this.cartRepository
                .findCartById(cartId)
                .orElseThrow(() -> new CartNotFoundException("Cart "+ cartId + "note found"));

        List<LineItem> items = cart.getItems();
        items.add(new LineItem(product, 1));
        cart.setItems(items);

        cartRepository.save(cart);
        return cart;
    }
}

