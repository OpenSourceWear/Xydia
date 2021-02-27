package com.xydiateam.xydia;

/**
 * Author: GrieferPig
 * Last Modify: 10/19/2020
 * Version: 0.6.3
 *
 * Convert Item to List.
 * Convert List to Json, or reverse
 *
 * Constants:
 *      _itemList: A storage for every item.
 *
 * Constructor:
 *
 *      itemListConverter()
 *
 * Methods:
 *
 *      addItem(App Item) return ItemListConverter
 *      getItemList() return ArrayList<App>
 *      toJson() return String
 *      fromJson(String json) return ItemListConverter
 */

import com.google.gson.Gson;

import java.util.ArrayList;


public class ItemListConverter extends RepoItemGrabber {

    ArrayList<App> _itemList;

    public ItemListConverter(){
        _itemList = new ArrayList<App>();
    }

    public ItemListConverter addItem(App Item){
        _itemList.add(Item);
        return this;
    }

    public ArrayList<App> getItemList(){
        return this._itemList;
    }

    public String toJson(){
        return new Gson().toJson(this._itemList);
    }

    public ItemListConverter fromJson(String json){
        this._itemList = new Gson().fromJson(json, _itemList.getClass());
        return this;
    }
}
