package com.example.iphone.interfaces;

import com.example.iphone.model.Favorite;

public interface IInternetBrowser {
    void openUrl(String url);
    void navigateTo(String url);
    void back();
    void forward();
    void refresh();
    void addFavorite(Favorite favorite);
    void removeFavorite(Favorite favorite);
}
