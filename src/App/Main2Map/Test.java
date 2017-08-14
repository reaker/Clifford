package App.Main2Map;

public class Test {

    public static void main(String[] args) {

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Object e = new Object();

        Cache cache = new Cache(2);

        cache.cacheItem(a, "AAA");
        cache.cacheItem(b, "BBB");
        cache.cacheItem(c, "CCC");
        cache.cacheItem(d, "DDD");
        cache.cacheItem(c, "CCC");
        cache.cacheItem(c, "CCC");

        //zawartość Cache'a :     b d c

        //indeksowanie  od 0 (najstarszy) do (size-1) np. 2 (najmłodszy)
        System.out.println(cache.getView().getItem(0));
        System.out.println(cache.getView().getItem(1));
        System.out.println(cache.getView().getItem(2));
//        System.out.println(cache.getView().getItem("BBB"));
    }
}
