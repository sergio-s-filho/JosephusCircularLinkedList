import java.io.*;

public class Main {
    public static void main(String[] args){
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
        int passo = 0;

        try {
            BufferedReader b_reader = new BufferedReader(new FileReader(args[0]));
            String value;

            while ((value = b_reader.readLine()) != null) {
                if(value.equals("FIM")){
                    passo = Integer.parseInt(b_reader.readLine());
                    break;
                }else if(!value.isEmpty()){
                    lista.adicionar(value);
                }
            }

            if(lista.size > 0){
                System.out.println(lista.resultadoFinal(passo));
            }else{
                System.out.println("Arquivo vazio");
            }

        } catch (Exception e) {
            System.out.println("Arquivo nao encontrado ou faltando informacoes");
        }
    }
}
