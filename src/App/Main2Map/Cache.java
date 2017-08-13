package App.Main2Map;

import App.Interface.CacheItem;
import App.Interface.CacheView;

import java.util.LinkedHashMap;

public class Cache implements App.Interface.Cache {

    private int size;
    private LinkedHashMap<String, App.Main2Map.CacheItem> map = new LinkedHashMap<>();

    //Constructor
    public Cache(int size) {
        this.size = size;
    }

    @Override  //add element to Cache and return this element
    public CacheItem cacheItem(Object item, String key) {

        App.Main2Map.CacheItem newCacheItem = new App.Main2Map.CacheItem(key, item);

        //if Cache has got that element
        if (map.containsKey(key)) {
            newCacheItem=map.get(key);
            map.remove(key); //delete because element might be in any position
            map.put(key, newCacheItem); //and add the same element (it will be added in newest position)
            return newCacheItem;
        }

        // if map doesn't contain this object then
        // 1. check if after adding it the size will be to big (if yes -> delet oldest element)
        // 2. add new element to Cache
        else {
            if ((map.size() + 1) > size) deleteOldestElement();
            map.put(key, newCacheItem);
            return newCacheItem;
        }
    }

    private void deleteOldestElement() {
        map.remove(map.entrySet().iterator().next().getKey());
    }

    @Override
    public void invalidateCache() {
        map.clear();
    }

    @Override
    public CacheView getView() {
        return new App.Main2Map.CacheView(size, map);
    }

}
