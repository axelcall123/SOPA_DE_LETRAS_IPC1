package sopadeletras;

class ALEATORIOS {
    private int one;
    private int two;
    public ALEATORIOS(){
        one=0;
        two=0;
    }
    public ALEATORIOS(int o,int d){
        one=o;
        two=d;
    }
    ///////////////////////////
    public int getOne(){
        return one;
    }
    public void setOne(int one){
        this.one=one;
    }
    /////////////////////////////
    public int getTwo(){
        return two;
    }
    public void setTwo(int two){
        this.two=two;
    }
}
