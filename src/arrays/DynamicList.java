/*
 * Michael Pu
 * ICS3U1 - DynamicList
 * November 2017
 */

package arrays;

public class DynamicList<T extends Object> {

    private T[] array;
    private int lastIndex;

    public DynamicList() {
        lastIndex = 1;
        array = new T[lastIndex];
    }

    public void add(T addObject) {
        if (lastIndex >= array.length) {
            T[] oldArray = new T[array.length];
            for (int i=0; i<array.length; i++) {
                oldArray[i] = array[i];
            }
            array = new T[oldArray.length*2];
            for (int i=0; i<oldArray.length; i++) {
                array[i] = oldArray[i];
            }
        }
        array[lastIndex] = addObject;
        lastIndex++;
    }

    public T get(int index) {
        return array[index];
    }

    public void clear(){
        for (int i=0; i<array.length; i++) {
            array[i] = null;
        }
    }
}
