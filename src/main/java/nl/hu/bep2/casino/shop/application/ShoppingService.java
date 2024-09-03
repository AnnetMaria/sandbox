package nl.hu.bep2.casino.shop.application;

import nl.hu.bep2.casino.shop.data.CartStorage;

import java.util.List;

public class ShoppingService {
    private final CartStorage cartStorage;

    public ShoppingService(CartStorage cartStorage) {
        this.cartStorage = cartStorage;
    }

    public List<List<Long>> addProductToCart(
            Long cartId, Long productId, Long productAmount, Long productPrice) {

        List<List<Long>> productList = this.cartStorage.findCartById(cartId);

        List<Long> product = List.of(productId, productAmount, productPrice);

        productList.add(product);

        this.cartStorage.save(cartId, productList);

        return productList;
    }
}

