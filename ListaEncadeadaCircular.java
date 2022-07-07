public class ListaEncadeadaCircular {
    No inicial;
    No atual;
    int size;

    public ListaEncadeadaCircular() {
        size = 0;
    }

    public void adicionar(String data) {

        if(size == 0){
            inicial = new No(data, (size + 1));
            atual = inicial;
            size++;
        }else{
            atual.proximo = new No(data, (size + 1));
            atual = atual.proximo;
            size++;
        }
    }


    public int resultadoFinal(int rotation) {
        atual.proximo = inicial;
        atual = atual.proximo;
        size++;
        No aux = inicial;
        No aux2 = inicial;
        while (aux.proximo != aux) {
            int rot = 0;
            while (rot != rotation) {
                aux2 = aux;
                aux = aux.proximo;
                rot++;
            }
            aux2.proximo = aux.proximo;
            aux = aux2.proximo;
        }
        return aux.getIndex();
    }
}

