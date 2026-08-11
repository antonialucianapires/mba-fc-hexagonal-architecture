package br.com.fullcycle.hexagonal.application;

public abstract class UnitUseCase<INPUT> {

    /*
    1. Cada caso de uso tem somente input.
    2. O caso de uso implementa o padrão Command, que é um padrão de design tem somente um método execute.
     */
    public abstract void execute(INPUT input);
}
