package Level_Jounin.generics;

import java.util.ArrayList;
import java.util.List;

public class NinjaBackpack<T> {


    //Initiate array
    private List<T> items;

    public NinjaBackpack(){
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void showItem(){
        for (T item : items){
            System.out.println(item);
        }
    }



}
