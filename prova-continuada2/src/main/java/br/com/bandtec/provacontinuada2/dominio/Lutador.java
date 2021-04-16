package br.com.bandtec.provacontinuada2.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotBlank
    @Size(min = 3, max = 12)
    private String nome;


    @PositiveOrZero
    private Double forcaGolpe = 0.0;


    @Positive
    private Double vida = 100.0;

    @PositiveOrZero
    private Integer concentracoesRealizadas = 0;


    private Boolean vivo = true;



//    // Como este é um campo virtual, NÃO sará criado como campo na tabela ;)
//    public Double getValorTotalEstoque() {
//        if (preco != null && quantidade != null) {
//            return preco * quantidade;
//        } else {
//            return null;
//        }

    // ex com operador ternário
    // return (preco != null && quantidade != null) ? preco * quantidade : null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
