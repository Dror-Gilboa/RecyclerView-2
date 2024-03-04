package com.example.recyclerview_2;

public class CardModel {
    String text1;
    String text2;
    int image;

    public CardModel(String text1, String text2, int image) {
        this.text1 = text1;
        this.text2 = text2;
        this.image = image;
    }

    public String getText1() {
        return text1;
    }
    public String getText2(){
        return text2;
    }
    public int getImage() {
        return image;
    }
}
