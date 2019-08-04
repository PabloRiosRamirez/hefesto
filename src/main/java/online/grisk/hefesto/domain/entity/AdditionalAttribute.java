package online.grisk.hefesto.domain.entity;

import lombok.Getter;

@Getter
public class AdditionalAttribute {
    private String name;
    private String apePad;
    private String apeMat;
    private String indEdad;
    private String indSexo;
    private String indTieneFDEF;
    private String indTotVehs;
    private String indGrpSocEc;
    private String indNacionalidad;
    private String indEstCiv;
    private String indNroHij;
    private String indCiudad;
    private String indComuna;
    private String indNivelEduc;

    public AdditionalAttribute(String name, String apePad, String apeMat, String indEdad, String indSexo, String indTieneFDEF, String indTotVehs, String indGrpSocEc, String indNacionalidad, String indEstCiv, String indNroHij, String indCiudad, String indComuna, String indNivelEduc) {
        this.name = name;
        this.apePad = apePad;
        this.apeMat = apeMat;
        this.indEdad = indEdad;
        this.indSexo = indSexo;
        this.indTieneFDEF = indTieneFDEF;
        this.indTotVehs = indTotVehs;
        this.indGrpSocEc = indGrpSocEc;
        this.indNacionalidad = indNacionalidad;
        this.indEstCiv = indEstCiv;
        this.indNroHij = indNroHij;
        this.indCiudad = indCiudad;
        this.indComuna = indComuna;
        this.indNivelEduc = indNivelEduc;
    }
}
