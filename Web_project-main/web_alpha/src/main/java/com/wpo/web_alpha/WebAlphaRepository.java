package com.wpo.web_alpha;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class WebAlphaRepository {
    private List<Item> items = new ArrayList<>();

    public Item getItem(int index){
        return items.get(index);
    }

    public void addItem( Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
}
