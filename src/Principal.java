public class Principal {

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
        No novoElemento = new No("A");
        fila.enfileirar(novoElemento);
        novoElemento = new No("B", null, null);
        fila.enfileirar(novoElemento);
        fila.enfileirar(new No("C"));
        fila.enfileirar(new No("D", null, null));
        fila.imprimir();
        fila.enfileirar(new No("E"));
        fila.imprimir();
        No removido = fila.desenfileirar();
        //fila.imprimir();
        System.out.println("Elemento removida da fila foi: " + removido.getData());
        removido = fila.desenfileirar();
        System.out.println("Elemento removida da fila foi: " + removido.getData());
        fila.imprimir();

    }
}
