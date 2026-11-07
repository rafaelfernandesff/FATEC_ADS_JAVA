public class Fila { 

    private No primeiro;
    private No ultimo;

    // construtor padrão primeiro e ultimo são nulos

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void enfileira (Pessoa pessoa) {
        No novo = new No(pessoa);
        if (estaVazia()) {
            primeiro = novo;
        }

        else {
            ultimo.setProximo(novo);
        }
        
        ultimo = novo;
    }



}
