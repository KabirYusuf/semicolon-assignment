package Assignment.DataStructure.Stack;



public class ArrayList implements List{

    java.util.ArrayList<String> listElements = new java.util.ArrayList<>();
    boolean isEmpty = true;


    @Override
    public void add(String item) {
        listElements.add(item);
        isEmpty = false;

    }

    @Override
    public void remove(int id) {
        listElements.remove(1);

    }

    @Override
    public void remove(String item) {
        listElements.remove(item);

    }

    @Override
    public String get(int id) {
        return listElements.get(id);

    }

    @Override
    public void add(String element, int id) {
        listElements.add(id,element);
        System.out.println(listElements);
    }

    @Override
    public void clear() {
        listElements.clear();
    }

    @Override
    public int size() {
        return listElements.size();
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String anotherItem) {
        for(String contains:listElements){
            if(listElements.contains(anotherItem)){
                return true;
            }
        }
        return false;
    }
}
