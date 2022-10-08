package kapitel6;

public class GenericList<G> {
    private Object[] list;
    private int size;

    public GenericList(int size) {
        list = new Object[size];
        this.size = size;
    }

    public void addElementAt(G element, int pos) {
        if (pos >= size)
            throw new ArrayIndexOutOfBoundsException();
        else
            list[pos] = element;
    }

    public G getAt(int pos) {
        if (pos >= size)
            throw new ArrayIndexOutOfBoundsException();
        else
            return (G) list[pos];
    }

}
