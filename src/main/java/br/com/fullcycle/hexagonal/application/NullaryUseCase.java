package br.com.fullcycle.hexagonal.application;

public abstract class NullaryUseCase<OUTPUT>{
    /*
    1. Cada caso de uso tem somente output.
    2. O caso de uso implementa o padrão Command, que é um padrão de design tem somente um método execute.
     */
    public abstract OUTPUT execute();
}
