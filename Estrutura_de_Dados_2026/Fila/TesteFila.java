public class TesteFila {
    public static void main(String[] args) {

        Pessoa p = new Pessoa(2020, "Ana");
        Fila fila = new Fila();

        fila.enfileira(p);
        System.out.println(fila);

        p = new Pessoa(2021, "Bia");
        fila.enfileira(p);
        System.out.println(fila);

        fila.enfileira(new Pessoa(2022, "Caio"));
        System.out.println(fila);

        p = fila.desemfilera();
        System.out.println(p.getNome() + " " +"Foi atendido");
        System.out.println(fila);

        /*
        Construir um metodo para cada ação:
        1 - Resetar uma fila
        2 - Buscar um elemento na fila; R return é boleano
        3 - Retornar a posição de um elemento na fila, considerando o primeiro
        posição 1; Se o elemento não existir retornar -1
        4 - Consultar o primeiro elemento da fila, sem remover
        5 - Consultar o ultimo elemento da fila, sem remover
        6 - Fazer todos esses métodos para lista tmb
         */



    }
}
