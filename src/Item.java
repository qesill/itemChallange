public class Item {
    public static int numItems = 0;
    final int ID;

    Item(int id) {
        ID = id;
    }

    public static int getNextId() {
        return Item.numItems++;
    }

    public static Item getItem() {
        //Dodaj statyczną metodę getItem() zwracającą nowy Item, który będzie miał unikalny id
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;

    }

    public static void printNumItems() {
        //Do item dodaj statyczną metodę printNumItems, która pokaże w konsoli
        //    aktualną wartość numItems
        System.out.println("Aktualna wartośc numItems to: " + Item.numItems);
    }

    public void printId() {
        System.out.println("Item ID: " + this.ID);
    }
    //Kończąc Item dodaj zwykła metodę printId() która pokaże w konsoli
    //    wartoś ID
}
