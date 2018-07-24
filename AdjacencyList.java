import javafx.scene.shape.QuadCurve;

public class AdjacencyList{
    private VertexList[] al;
    private int index = 0;
    private int quantity = 0;

    AdjacencyList(int quantity){
        this.quantity = quantity;
        al = new VertexList[quantity];
    }
    
    public void add(VertexList vl){
        al[index] = vl;
        this.index ++;    
    }

    public VertexList get(int index){
        return (this.index >= index) ? al[index] : null;
    }

    public void printAll(){
        for(int i = 0; i < this.quantity; i++){
            for(int j = 0; j < al[i].length(); j++){
                System.out.print(" ");
                System.out.print(al[i].get(j).getId());
            }
            System.out.print("\n");
        }
    }

}
 
