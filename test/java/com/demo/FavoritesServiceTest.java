package com.demo;

import org.junit.jupiter.api.Test;

public class FavoritesServiceTest {

    private final FavoritesService service = new FavoritesService();

    @Test
    void testGetFavoriteDocument() {
        String[] favorites = {"Document", "Product", "Category"};

        service.getFavorite(favorites, 3);
    }

    @Test
    void testGetFavoriteProductFamily() {
        String[] favorites = {"Document", "Product", "Category"};

        service.getFavorite(favorites, 3);
    }

    @Test
    void testGetFavoriteCategory() {
        String[] favorites = {"Document", "Product", "Category"};

        service.getFavorite(favorites, 3);
    }
}
