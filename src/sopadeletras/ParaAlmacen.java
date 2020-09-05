package sopadeletras;
public class ParaAlmacen{
    //////////////////////ALAMACEN DE DATOS AREGLO DE OBJETOS
  private String name;
  private int point;
  
  private int fails;
  private int find;
  
   public ParaAlmacen(){
        name="";
        point=0;
        fails=0;
        find=0;
    }
    public ParaAlmacen(String n, int p,int f,int s){
        name=n;
        point=p;
        fails=f;
        find=s;
    }
    //////////////////////////////
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;  
    }
    ////////////////////////////////
    public int getPoint(){
        return point;
    }
    public void setPoint(int point){
        this.point= point;  
    }
    ///////////////////////////////
    public int getFails(){
        return fails;
    }
    public void setFails(int fails){
        this.fails= fails;  
    }
    /////////////////////////////
    public int getFind(){
        return find;
    }
    public void setFind(int find){
        this.find= find;  
    }
}

