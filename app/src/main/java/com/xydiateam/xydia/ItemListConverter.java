package com.xydiateam.xydia;

/**
 * Author:GrieferPig
 * Last Modify: 10/19/2020
 * Version: 0.6.1
 *
 * Convert Item to List, or reverse.
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
 */

import java.util.ArrayList;


public class ItemListConverter {

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
}
