package App.Interface;

public interface Cache {

    CacheItem cacheItem(Object item, String key); //zapisuje obiekt w Cacheu

    void invalidateCache(); // czyści nasz Cache

    CacheView getView(); // zwraca "widok: na nasz Chace

}
