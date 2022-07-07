public class No {

    public String data;
    public int index;
    public No proximo;

    public No(String data,int index){
        this.data = data;
        this.index = index;
    }


    public String getData(){
        return data;
    }

    public int getIndex(){
        return index;
    }
}
