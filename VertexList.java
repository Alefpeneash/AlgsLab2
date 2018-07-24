import java.util.ArrayList;


public class VertexList{
    private ArrayList<Vertex> vl = new ArrayList<Vertex>();

    public void add(int i, Vertex elem){
        this.vl.add(i, elem);
    }

    public void addToEnd(Vertex elem){
        vl.add(vl.size(), elem);
    }


    public Vertex get(int i){
        return vl.get(i);
    }

    public int length(){
        return vl.size();
    }

}