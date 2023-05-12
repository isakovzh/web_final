package com.wpo.web_alpha;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebAlphaService {

    @Autowired
    WebAlphaRepository webAlphaRepository = new WebAlphaRepository();
    public Item getItem(int index){
        return webAlphaRepository.getItem(index);
    }

    public void addItem( Item item){
        webAlphaRepository.addItem(item);
    }
    public List<Item> getItems(){
        return webAlphaRepository.getItems();
    }

    public int getIndexf(Date date){
        for (int i = 0; i < getItems().size(); i++) {
            if (getItem(i).getDate().equals(date)) return i;
        }
        return Constant.NOT_FOUND;
    }
}
