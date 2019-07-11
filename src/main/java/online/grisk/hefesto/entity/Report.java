package online.grisk.hefesto.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Report {
    public static Map create() {
        Map<String, Object> report = new HashMap<>();
        report.put("status", "completed");
        report.put("uuid", UUID.randomUUID().toString());
        report.put("applicant", new Applicant());
        report.put("dateCreated", new Date().toString());
        report.put("dateModified", "--");
        return report;
    }
}

class Applicant {
    Ccb ccb;

    public Applicant() {
        this.ccb = new Ccb();
    }

    public Ccb getCcb() {
        return ccb;
    }
}

class Ccb {
    AdditionalAttribute additionalAttribute;
    Attribute attribute;

    public Ccb() {
        this.additionalAttribute = new AdditionalAttribute();
        this.attribute = new Attribute();
    }

    public AdditionalAttribute getAdditionalAttribute() {
        return additionalAttribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }
}

class AdditionalAttribute {
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

    public AdditionalAttribute() {
        this.name = "";
        this.apePad = "";
        this.apeMat = "";
        this.indEdad = "";
        this.indSexo = "";
        this.indTieneFDEF = "";
        this.indTotVehs = "";
        this.indGrpSocEc = "";
        this.indNacionalidad = "";
        this.indEstCiv = "";
        this.indNroHij = "";
        this.indCiudad = "";
        this.indComuna = "";
        this.indNivelEduc = "";

    }

    public String getName() {
        return name;
    }

    public String getApePad() {
        return apePad;
    }

    public String getApeMat() {
        return apeMat;
    }

    public String getIndEdad() {
        return indEdad;
    }

    public String getIndSexo() {
        return indSexo;
    }

    public String getIndTieneFDEF() {
        return indTieneFDEF;
    }

    public String getIndTotVehs() {
        return indTotVehs;
    }

    public String getIndGrpSocEc() {
        return indGrpSocEc;
    }

    public String getIndNacionalidad() {
        return indNacionalidad;
    }

    public String getIndEstCiv() {
        return indEstCiv;
    }

    public String getIndNroHij() {
        return indNroHij;
    }

    public String getIndCiudad() {
        return indCiudad;
    }

    public String getIndComuna() {
        return indComuna;
    }

    public String getIndNivelEduc() {
        return indNivelEduc;
    }
}

class Attribute {
    private String indTotDoc02;
    private String indTotDoc06;
    private String indTotDoc12;
    private String indTotDocA02;
    private String indTotDocA06;
    private String indTotDocA12;
    private String indTotDocNA02;
    private String indTotDocNA06;
    private String indTotDocNA12;
    private String indMontDoc02;
    private String indMontDoc06;
    private String indMontDoc12;
    private String indMontDocA02;
    private String indMontDocA06;
    private String indMontDocA12;
    private String indMontDocNA02;
    private String indMontDocNA06;
    private String indMontDocNA12;
    private String indCantCC02;
    private String indCantCC06;
    private String indCantCC12;
    private String indCantTC02;
    private String indCantTC06;
    private String indCantTC12;

    private String indDicScore02;
    private String indDicScore06;
    private String indDicScore12;
    private String indBolCom02;
    private String indBolCom06;
    private String indBolCom12;
    private String indDiasAtrRcc02;
    private String indDiasAtrRcc06;
    private String indDiasAtrRcc12;

    private String indUltConst;
    private String indCantSocios;
    private String indBedSocios;
    private String indBolComSocios;
    private String indCantPersonasHH;
    private String indVehAvalTotal;
    private String indBbrrAvalTotal;
    private String indNroAcreed;
    private String indBolConc;

    public Attribute() {
        this.indTotDoc02 = "";
        this.indTotDoc06 = "";
        this.indTotDoc12 = "";
        this.indTotDocA02 = "";
        this.indTotDocA06 = "";
        this.indTotDocA12 = "";
        this.indTotDocNA02 = "";
        this.indTotDocNA06 = "";
        this.indTotDocNA12 = "";
        this.indMontDoc02 = "";
        this.indMontDoc06 = "";
        this.indMontDoc12 = "";
        this.indMontDocA02 = "";
        this.indMontDocA06 = "";
        this.indMontDocA12 = "";
        this.indMontDocNA02 = "";
        this.indMontDocNA06 = "";
        this.indMontDocNA12 = "";
        this.indCantCC02 = "";
        this.indCantCC06 = "";
        this.indCantCC12 = "";
        this.indCantTC02 = "";
        this.indCantTC06 = "";
        this.indCantTC12 = "";
        this.indDicScore02 = "";
        this.indDicScore06 = "";
        this.indDicScore12 = "";
        this.indBolCom02 = "";
        this.indBolCom06 = "";
        this.indBolCom12 = "";
        this.indDiasAtrRcc02 = "";
        this.indDiasAtrRcc06 = "";
        this.indDiasAtrRcc12 = "";
        this.indUltConst = "";
        this.indCantSocios = "";
        this.indBedSocios = "";
        this.indBolComSocios = "";
        this.indCantPersonasHH = "";
        this.indVehAvalTotal = "";
        this.indBbrrAvalTotal = "";
        this.indNroAcreed = "";
        this.indBolConc = "";
    }

    public String getIndTotDoc02() {
        return indTotDoc02;
    }

    public String getIndTotDoc06() {
        return indTotDoc06;
    }

    public String getIndTotDoc12() {
        return indTotDoc12;
    }

    public String getIndTotDocA02() {
        return indTotDocA02;
    }

    public String getIndTotDocA06() {
        return indTotDocA06;
    }

    public String getIndTotDocA12() {
        return indTotDocA12;
    }

    public String getIndTotDocNA02() {
        return indTotDocNA02;
    }

    public String getIndTotDocNA06() {
        return indTotDocNA06;
    }

    public String getIndTotDocNA12() {
        return indTotDocNA12;
    }

    public String getIndMontDoc02() {
        return indMontDoc02;
    }

    public String getIndMontDoc06() {
        return indMontDoc06;
    }

    public String getIndMontDoc12() {
        return indMontDoc12;
    }

    public String getIndMontDocA02() {
        return indMontDocA02;
    }

    public String getIndMontDocA06() {
        return indMontDocA06;
    }

    public String getIndMontDocA12() {
        return indMontDocA12;
    }

    public String getIndMontDocNA02() {
        return indMontDocNA02;
    }

    public String getIndMontDocNA06() {
        return indMontDocNA06;
    }

    public String getIndMontDocNA12() {
        return indMontDocNA12;
    }

    public String getIndCantCC02() {
        return indCantCC02;
    }

    public String getIndCantCC06() {
        return indCantCC06;
    }

    public String getIndCantCC12() {
        return indCantCC12;
    }

    public String getIndCantTC02() {
        return indCantTC02;
    }

    public String getIndCantTC06() {
        return indCantTC06;
    }

    public String getIndCantTC12() {
        return indCantTC12;
    }

    public String getIndDicScore02() {
        return indDicScore02;
    }

    public String getIndDicScore06() {
        return indDicScore06;
    }

    public String getIndDicScore12() {
        return indDicScore12;
    }

    public String getIndBolCom02() {
        return indBolCom02;
    }

    public String getIndBolCom06() {
        return indBolCom06;
    }

    public String getIndBolCom12() {
        return indBolCom12;
    }

    public String getIndDiasAtrRcc02() {
        return indDiasAtrRcc02;
    }

    public String getIndDiasAtrRcc06() {
        return indDiasAtrRcc06;
    }

    public String getIndDiasAtrRcc12() {
        return indDiasAtrRcc12;
    }

    public String getIndUltConst() {
        return indUltConst;
    }

    public String getIndCantSocios() {
        return indCantSocios;
    }

    public String getIndBedSocios() {
        return indBedSocios;
    }

    public String getIndBolComSocios() {
        return indBolComSocios;
    }

    public String getIndCantPersonasHH() {
        return indCantPersonasHH;
    }

    public String getIndVehAvalTotal() {
        return indVehAvalTotal;
    }

    public String getIndBbrrAvalTotal() {
        return indBbrrAvalTotal;
    }

    public String getIndNroAcreed() {
        return indNroAcreed;
    }

    public String getIndBolConc() {
        return indBolConc;
    }
}
