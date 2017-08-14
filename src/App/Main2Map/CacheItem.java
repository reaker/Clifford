package App.Main2Map;

public class CacheItem implements App.Interface.CacheItem {

    private String key;
    private Object object;

    CacheItem(String key, Object obj) {
        this.key = key;
        this.object = obj;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Object getValue() {

        return object;
    }

    @Override
    public String toString() {
        return "CacheItem{" +
                "key='" + key + '\'' +
                ", object=" + object +
                '}';
    }
}
