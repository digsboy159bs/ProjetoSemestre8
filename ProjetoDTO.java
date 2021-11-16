/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Intel
 */
public class ProjetoDTO {
    
    private int id_Projeto;
    
    private int id_Usuario;
    
    private String descricao, nome_Projeto, modulo, funcionalidades, autor, autor_modificacao, prioridade, data_criacao, data_modificacao, esforco, versao, Estado;
    
    private String complexidade;

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public String getNome_Projeto() {
        return nome_Projeto;
    }

    public void setNome_Projeto(String nome_Projeto) {
        this.nome_Projeto = nome_Projeto;
    }
    
    

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(String funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_modificacao() {
        return autor_modificacao;
    }

    public void setAutor_modificacao(String autor_modificacao) {
        this.autor_modificacao = autor_modificacao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getData_modificacao() {
        return data_modificacao;
    }

    public void setData_modificacao(String data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

    public String getEsforco() {
        return esforco;
    }

    public void setEsforco(String esforco) {
        this.esforco = esforco;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getId_Projeto() {
        return id_Projeto;
    }

    public void setId_Projeto(int id_Projeto) {
        this.id_Projeto = id_Projeto;
    }
    
    
    
}
