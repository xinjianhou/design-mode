package iterator;

public class MainMenu {
    Menu tvMenu;
    FilmMenu filmMenu;

    public MainMenu(Menu tvMenu,FilmMenu filmMenu){
        this.tvMenu = tvMenu;
        this.filmMenu  = filmMenu;
    }

    public void printMenu(){
        Iterator tvIterator = tvMenu.createIrerator();
        Iterator filmIterator = filmMenu.createIrerator();

        System.out.println("电视节目有:");
        printMenu(tvIterator);
        System.out.println("----------------------------------------------------------------");
        System.out.println("电影节目有:");
        printMenu(filmIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print("channe:"+menuItem.getChannel()+",  ");
            System.out.print("name:"+menuItem.getName()+",  ");
            System.out.println("description :"+menuItem.getDescription());
        }
    }

}
