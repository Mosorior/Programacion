package com.gamefreak.pokemon;

/**
 *
 * @author mosorior
 */
public class Pokemon {

    private int id;
    private String nombre;
    private String tipo;
    private String tipo2;
    private int lvl;
    private int ataque;
    private int defensa;
    private int hp;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private String habilidad;
    private boolean capturado;

    public Pokemon(int id, String nombre, String tipo, String tipo2, int lvl, int ataque, int defensa, int hp, int ataqueEspecial,
                   int defensaEspecial, int velocidad, String habilidad, boolean capturado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipo2 = tipo2;
        this.lvl = lvl;
        this.ataque = ataque;
        this.defensa = defensa;
        this.hp = hp;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.habilidad = habilidad;
        this.capturado = capturado;
    }

    // Getters y setters para todos los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.id = lvl;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

}
