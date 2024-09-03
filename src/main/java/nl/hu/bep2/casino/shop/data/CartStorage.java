package nl.hu.bep2.casino.shop.data;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CartStorage {

    private Map<long, List<List<Long>>> cartList;
    public List<List<Long>> findCartById(Long cartId) {
        return cartList.get(cartId);
    }

    public void save(Long cartId, List<List<Long>> productList) {
        System.out.println("Product list saved");
        List<List<Long>> cart = findCartById(cartId);
        cart.addAll(productList);
    }

}
