/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynews;

/**
 *
 * @author riquemlo
 */
public class Noticia {
    private int id;
    private String titulo;
    private String conteudo;
    private String link;
    private String categoria;
    private String imagem;
    private int dataReferencia;

    public Noticia(int id, String titulo, String conteudo, String categoria, int dataReferencia) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.categoria = categoria;
        this.dataReferencia = dataReferencia;
    }

    public int getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(int dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
