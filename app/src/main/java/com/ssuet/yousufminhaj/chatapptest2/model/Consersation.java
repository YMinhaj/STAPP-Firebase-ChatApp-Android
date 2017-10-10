package com.ssuet.yousufminhaj.chatapptest2.model;

/**
 * Created by Yousuf Minhaj on 10/8/2017.
 */

import java.util.ArrayList;



public class Consersation {
    private ArrayList<Message> listMessageData;
    public Consersation(){
        listMessageData = new ArrayList<>();
    }

    public ArrayList<Message> getListMessageData() {
        return listMessageData;
    }
}