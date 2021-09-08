package Lista;
 
public class NodeParq {
    
    private NodeParq Next=null;
    private NodeParq previous=null;
    private Space value=null; 
    private int puesto;
    
    public NodeParq getNext() {
        return Next;
    }

    public void setNext(NodeParq Next) {
        this.Next = Next;
    }

    public NodeParq getPrevious() {
        return previous;
    }

    public void setPrevious(NodeParq previous) {
        this.previous = previous;
    }

    public Space getValue() {
        return value;
    }

    public void setValue(Space value) {
        this.value = value;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
 
    
    
}
