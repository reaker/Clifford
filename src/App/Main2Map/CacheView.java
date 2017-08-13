package App.Main2Map;

import App.Interface.CacheItem;

import java.util.LinkedHashMap;

public class CacheView implements App.Interface.CacheView {
    private int size;
    private LinkedHashMap<String, App.Main2Map.CacheItem> map = new LinkedHashMap<>();

    CacheView(int size, LinkedHashMap<String, App.Main2Map.CacheItem> map) {
        this.size = size;
        this.map = map;
    }

    @Override
    public int size() {
        return size; //max         // don't know if it should return actual or max size?
        //return  map.size(); //actual
    }

    @Override
    public CacheItem getItem(int index) {
        App.Main2Map.CacheItem item = null;

        if (index > size || index < 0) return null;  // if index is out of range -> return null

        // iterate through map until it reach indexed element (last element of loop)
        for (int i = 0; i < index; i++) {
            item = map.entrySet().iterator().next().getValue();
        }
        return item;
    }

    @Override
    public CacheItem getItem(String key) {
        if (!map.containsKey(key)) return null; // if map doesn't contain element, then return null
        return map.get(key);
    }
}
