package tech.devinhouse.funcionarios;

@FunctionalInterface
public interface Autenticavel {

    public boolean autenticar(String nome, String senha);

}
