public class List {


    private Cell front;

    public List() {
        front = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void removeYAfterX(int x, int y) {
        if (front != null) {
            Cell it = front;
            while (it.next != null) {
                Cell n = it.next;
                if (it.content == x && n.content == y) {
                    it.next = n.next;
                    break;
                } else {
                    it = it.next;


                }

            }
        }
    }

}