public class FilaDinamica {

    private No cabeca;
    private No cauda;
    private int tamanho; //tamanho da fila

    public void enfileirar(No novoElemento){
        //se a fila estiver vazia
        if(cabeca == null){
            cabeca = novoElemento; //adicionar o elemento na cabeça
            cauda = cabeca;
        }else{
            novoElemento.setProx(cauda.getProx());
            novoElemento.setAnt(cauda);
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
        tamanho++;
    }
}
