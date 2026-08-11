package br.com.fullcycle.hexagonal.application;

public abstract class UseCase<INPUT, OUTPUT> {

    /*
    1. Cada caso de uso tem um input e um output. Não retorna entidade, agregado ou objetio de domínio. Retorna DTO ou objeto de valor.
    2. O caso de uso implementa o padrão Command, que é um padrão de design tem somente um método execute. O execute recebe um input e retorna um output.
     */
    public abstract OUTPUT execute(INPUT input);
}
