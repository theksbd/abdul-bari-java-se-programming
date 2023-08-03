class Data<T> {
    private T data;

    public void setData(T value) {
        data = value;
    }

    public T getData() {
        return data;
    }
}

class MyArray<T> {
    private int length;
    private T[] data;

    public MyArray() {
        this.length = 0;
        this.data = (T[]) new Object[10];
    }

    public MyArray(int length, T[] data) {
        this.length = length;
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public void append(T value) {
        data[length++] = value;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(10);

        System.out.println(d.getData());

        MyArray<Integer> m = new MyArray<>();
        m.append(10);
        m.append(7);
        m.append(0);
        m.append(3);
        m.append(-6);

        m.display();
    }
}
