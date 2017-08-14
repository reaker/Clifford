package App.Main2Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CacheView implements App.Interface.CacheView {
    private int size;
    private LinkedHashMap<String, App.Main2Map.CacheItem> map = new LinkedHashMap<>();

    CacheView(int size, LinkedHashMap<String, App.Main2Map.CacheItem> map) {
        this.size = size;
        this.map = map;
    }

    @Override
    public int size() {
        int count = 0;
        for (Object o : map.entrySet()) {
            count++;
        }
        return count;
    }

    @Override
    public App.Main2Map.CacheItem getItem(int index) {

        if (index >= size() || index < 0) return null;  // if index is out of range -> return null
        App.Main2Map.CacheItem item = null;

        // iterate through map until it reach indexed element (last element of loop)
        Iterator iter = map.entrySet().iterator();
        for (int i = 0; i <= index; i++) {
            if (iter.hasNext()) {
                Map.Entry pair = (Map.Entry) iter.next();
                if (pair != null)
                    item = (App.Main2Map.CacheItem) pair.getValue();
                else
                    return null;
            }
        }
        return item;
    }

    @Override
    public App.Main2Map.CacheItem getItem(String key) {
        if (!map.containsKey(key)) return null; // if map doesn't contain element, then return null
        return map.get(key);
    }
}
