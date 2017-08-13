package App.Interface;

public interface CacheView {

    int size(); //zwraca wielkość Cachea

    CacheItem getItem(int index);//zwraca obiekt o podanym  indeksie

    CacheItem getItem(String key); //zwraca obiekt o podanym kluczu
}
