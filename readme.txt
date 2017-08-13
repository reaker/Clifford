Nie istnieje kolekcja Javy która idealnie wpasowała by się w problem, ponieważ LinkedHashMap nie ma metody zwracającej obiekt o podanym
indeksie -> trzeba przeiterować mapę tyle razy ile wynosi indeks. Nie powinno się używać takiej metody do otrzymania obiektu w przypadku dużego 
Cache'a.
