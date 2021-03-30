/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretariadesalud;

/**
 *
 * @author Oscar
 */
public final class Paciente extends Persona{
 String paci;
 String codigo;   
 String dirrecion;
 String residencia;
 String lugarAten; //lugar donde fue atendido
 String motConsul; //motivo de la consulta
 String fecha;

    public Paciente() {
    }

    public String getPaci() {
        return paci;
    }

    public void setPaci(String paci) {
        this.paci = paci;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getLugarAten() {
        return lugarAten;
    }

    public void setLugarAten(String lugarAten) {
        this.lugarAten = lugarAten;
    }

    public String getMotConsul() {
        return motConsul;
    }

    public void setMotConsul(String motConsul) {
        this.motConsul = motConsul;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
 public String ImpriPaciente(){
return(paci);
}
}
