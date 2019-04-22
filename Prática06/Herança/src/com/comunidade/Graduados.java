package com.comunidade;

public class Graduados extends MembroDaComunidade {
    private String curso;

    public Graduados(String nome, String cpf, String curso) {
        super(nome, cpf);
        this.curso = curso;
    }
        @Override
        public String getDados(){
            return super.getDados() + '\t' + curso;
        }
}
