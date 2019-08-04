package online.grisk.hefesto.domain.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.grisk.hefesto.domain.entity.Applicant;
import online.grisk.hefesto.domain.entity.Attribute;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Map;

public class BureauBuilder {

    private static String[] useCaseGood = {
            "{\"indTotDoc02\":\"\",\"indTotDoc06\":\"\",\"indTotDoc12\":\"\",\"indTotDocA02\":\"\",\"indTotDocA06\":\"\",\"indTotDocA12\":\"\",\"indTotDocNA02\":\"\",\"indTotDocNA06\":\"\",\"indTotDocNA12\":\"\",\"indMontDoc02\":\"\",\"indMontDoc06\":\"\",\"indMontDoc12\":\"\",\"indMontDocA02\":\"\",\"indMontDocA06\":\"\",\"indMontDocA12\":\"\",\"indMontDocNA02\":\"\",\"indMontDocNA06\":\"\",\"indMontDocNA12\":\"\",\"indCantCC02\":\"\",\"indCantCC06\":\"\",\"indCantCC12\":\"\",\"indCantTC02\":\"\",\"indCantTC06\":\"\",\"indCantTC12\":\"\",\"indDicScore02\":\"\",\"indDicScore06\":\"\",\"indDicScore12\":\"\",\"indBolCom02\":\"\",\"indBolCom06\":\"\",\"indBolCom12\":\"\",\"indDiasAtrRcc02\":\"\",\"indDiasAtrRcc06\":\"\",\"indDiasAtrRcc12\":\"\",\"indUltConst\":\"\",\"indCantSocios\":\"\",\"indBedSocios\":\"\",\"indBolComSocios\":\"\",\"indCantPersonasHH\":\"\",\"indVehAvalTotal\":\"\",\"indBbrrAvalTotal\":\"\",\"indNroAcreed\":\"\",\"indBolConc\":\"\"}",
            "{\"name\":\"PABLO ANDRES\",\"apePad\":\"RIOS\",\"apeMat\":\"RAMIREZ\",\"indEdad\":\"26\",\"indSexo\":\"M\",\"indTieneFDEF\":\"\",\"indTotVehs\":\"\",\"indGrpSocEc\":\"ABC1\",\"indNacionalidad\":\"CHILENA\",\"indEstCiv\":\"SOLTERO\",\"indNroHij\":\"0\",\"indCiudad\":\"SANTIAGO\",\"indComuna\":\"VITACURA\",\"indNivelEduc\":\"TECNICA PROFESIONAL\"}"
    };
    private static String[] useCaseMedium = {
            "{\"indTotDoc02\":\"\",\"indTotDoc06\":\"\",\"indTotDoc12\":\"\",\"indTotDocA02\":\"\",\"indTotDocA06\":\"\",\"indTotDocA12\":\"\",\"indTotDocNA02\":\"\",\"indTotDocNA06\":\"\",\"indTotDocNA12\":\"\",\"indMontDoc02\":\"\",\"indMontDoc06\":\"\",\"indMontDoc12\":\"\",\"indMontDocA02\":\"\",\"indMontDocA06\":\"\",\"indMontDocA12\":\"\",\"indMontDocNA02\":\"\",\"indMontDocNA06\":\"\",\"indMontDocNA12\":\"\",\"indCantCC02\":\"\",\"indCantCC06\":\"\",\"indCantCC12\":\"\",\"indCantTC02\":\"\",\"indCantTC06\":\"\",\"indCantTC12\":\"\",\"indDicScore02\":\"\",\"indDicScore06\":\"\",\"indDicScore12\":\"\",\"indBolCom02\":\"\",\"indBolCom06\":\"\",\"indBolCom12\":\"\",\"indDiasAtrRcc02\":\"\",\"indDiasAtrRcc06\":\"\",\"indDiasAtrRcc12\":\"\",\"indUltConst\":\"\",\"indCantSocios\":\"\",\"indBedSocios\":\"\",\"indBolComSocios\":\"\",\"indCantPersonasHH\":\"\",\"indVehAvalTotal\":\"\",\"indBbrrAvalTotal\":\"\",\"indNroAcreed\":\"\",\"indBolConc\":\"\"}",
            "{\"name\":\"PABLO ANDRES\",\"apePad\":\"RIOS\",\"apeMat\":\"RAMIREZ\",\"indEdad\":\"26\",\"indSexo\":\"M\",\"indTieneFDEF\":\"\",\"indTotVehs\":\"\",\"indGrpSocEc\":\"ABC1\",\"indNacionalidad\":\"CHILENA\",\"indEstCiv\":\"SOLTERO\",\"indNroHij\":\"0\",\"indCiudad\":\"SANTIAGO\",\"indComuna\":\"VITACURA\",\"indNivelEduc\":\"TECNICA PROFESIONAL\"}"
    };
    private static String[] useCaseBad = {
            "{\"indTotDoc02\":\"\",\"indTotDoc06\":\"\",\"indTotDoc12\":\"\",\"indTotDocA02\":\"\",\"indTotDocA06\":\"\",\"indTotDocA12\":\"\",\"indTotDocNA02\":\"\",\"indTotDocNA06\":\"\",\"indTotDocNA12\":\"\",\"indMontDoc02\":\"\",\"indMontDoc06\":\"\",\"indMontDoc12\":\"\",\"indMontDocA02\":\"\",\"indMontDocA06\":\"\",\"indMontDocA12\":\"\",\"indMontDocNA02\":\"\",\"indMontDocNA06\":\"\",\"indMontDocNA12\":\"\",\"indCantCC02\":\"\",\"indCantCC06\":\"\",\"indCantCC12\":\"\",\"indCantTC02\":\"\",\"indCantTC06\":\"\",\"indCantTC12\":\"\",\"indDicScore02\":\"\",\"indDicScore06\":\"\",\"indDicScore12\":\"\",\"indBolCom02\":\"\",\"indBolCom06\":\"\",\"indBolCom12\":\"\",\"indDiasAtrRcc02\":\"\",\"indDiasAtrRcc06\":\"\",\"indDiasAtrRcc12\":\"\",\"indUltConst\":\"\",\"indCantSocios\":\"\",\"indBedSocios\":\"\",\"indBolComSocios\":\"\",\"indCantPersonasHH\":\"\",\"indVehAvalTotal\":\"\",\"indBbrrAvalTotal\":\"\",\"indNroAcreed\":\"\",\"indBolConc\":\"\"}",
            "{\"name\":\"PABLO ANDRES\",\"apePad\":\"RIOS\",\"apeMat\":\"RAMIREZ\",\"indEdad\":\"26\",\"indSexo\":\"M\",\"indTieneFDEF\":\"\",\"indTotVehs\":\"\",\"indGrpSocEc\":\"ABC1\",\"indNacionalidad\":\"CHILENA\",\"indEstCiv\":\"SOLTERO\",\"indNroHij\":\"0\",\"indCiudad\":\"SANTIAGO\",\"indComuna\":\"VITACURA\",\"indNivelEduc\":\"TECNICA PROFESIONAL\"}"
    };
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Applicant builder(@NotBlank String rut) throws IOException {
        Map atributte = objectMapper.readValue(useCaseGood[0], Map.class);
        Map additionaltributte = objectMapper.readValue(useCaseGood[1], Map.class);
        return create(atributte, additionaltributte);
    }


    private static Applicant create(@NotNull Map<String, String> attributes, @NotNull Map<String, String> additionalAttributes) {

        Applicant applicant = new Applicant(
                new Attribute(
                        attributes.getOrDefault("name", "--").toString(),
                        attributes.getOrDefault("apePad", "--").toString(),
                        attributes.getOrDefault("apeMat", "--").toString(),
                        attributes.getOrDefault("indEdad", "0").toString(),
                        attributes.getOrDefault("indSexo", "--").toString(),
                        attributes.getOrDefault("indNacionalidad", "--").toString(),
                        attributes.getOrDefault("indEstCiv", "--").toString(),
                        attributes.getOrDefault("indNroHij", "0").toString(),
                        attributes.getOrDefault("indTieneFDEF", "--").toString(),
                        attributes.getOrDefault("indTotVehs", "0").toString(),
                        attributes.getOrDefault("indMonVehs", "0").toString(),
                        attributes.getOrDefault("indTotBBRR", "0").toString(),
                        attributes.getOrDefault("indMonBBRR", "0").toString(),
                        attributes.getOrDefault("indGrpSocEc", "--").toString(),
                        attributes.getOrDefault("indNivelEduc", "--").toString(),
                        attributes.getOrDefault("indCantDoc02", "0").toString(),
                        attributes.getOrDefault("indCantDoc06", "0").toString(),
                        attributes.getOrDefault("indCantDoc12", "0").toString(),
                        attributes.getOrDefault("indCantDoc24", "0").toString(),
                        attributes.getOrDefault("indCantDoc36", "0").toString(),
                        attributes.getOrDefault("indCantDocA02", "0").toString(),
                        attributes.getOrDefault("indCantDocA06", "0").toString(),
                        attributes.getOrDefault("indCantDocA12", "0").toString(),
                        attributes.getOrDefault("indCantDocA24", "0").toString(),
                        attributes.getOrDefault("indCantDocA36", "0").toString(),
                        attributes.getOrDefault("indCantDocNA02", "0").toString(),
                        attributes.getOrDefault("indCantDocNA06", "0").toString(),
                        attributes.getOrDefault("indCantDocNA12", "0").toString(),
                        attributes.getOrDefault("indCantDocNA24", "0").toString(),
                        attributes.getOrDefault("indCantDocNA36", "0").toString(),
                        attributes.getOrDefault("indMonDoc02", "0,00").toString(),
                        attributes.getOrDefault("indMonDoc06", "0,00").toString(),
                        attributes.getOrDefault("indMonDoc12", "0,00").toString(),
                        attributes.getOrDefault("indMonDoc24", "0,00").toString(),
                        attributes.getOrDefault("indMonDoc36", "0,00").toString(),
                        attributes.getOrDefault("indMonDocA02", "0,00").toString(),
                        attributes.getOrDefault("indMonDocA06", "0,00").toString(),
                        attributes.getOrDefault("indMonDocA12", "0,00").toString(),
                        attributes.getOrDefault("indMonDocA24", "0,00").toString(),
                        attributes.getOrDefault("indMonDocA36", "0,00").toString(),
                        attributes.getOrDefault("indMonDocNA02", "0,00").toString(),
                        attributes.getOrDefault("indMonDocNA06", "0,00").toString(),
                        attributes.getOrDefault("indMonDocNA12", "0,00").toString(),
                        attributes.getOrDefault("indMonDocNA24", "0,00").toString(),
                        attributes.getOrDefault("indMonDocNA36", "0,00").toString(),
                        attributes.getOrDefault("indCantCCC02", "0").toString(),
                        attributes.getOrDefault("indCantCCC06", "0").toString(),
                        attributes.getOrDefault("indCantCCC12", "0").toString(),
                        attributes.getOrDefault("indCantCCC24", "0").toString(),
                        attributes.getOrDefault("indCantCCC36", "0").toString(),
                        attributes.getOrDefault("indCantTCC02", "0").toString(),
                        attributes.getOrDefault("indCantTCC06", "0").toString(),
                        attributes.getOrDefault("indCantTCC12", "0").toString(),
                        attributes.getOrDefault("indCantTCC24", "0").toString(),
                        attributes.getOrDefault("indCantTCC36", "0").toString(),
                        attributes.getOrDefault("indPuntScore02", "0").toString(),
                        attributes.getOrDefault("indPuntScore06", "0").toString(),
                        attributes.getOrDefault("indPuntScore12", "0").toString(),
                        attributes.getOrDefault("indPuntScore24", "0").toString(),
                        attributes.getOrDefault("indPuntScore36", "0").toString(),
                        attributes.getOrDefault("indBolCon02", "--").toString(),
                        attributes.getOrDefault("indBolCon06", "--").toString(),
                        attributes.getOrDefault("indBolCon12", "--").toString(),
                        attributes.getOrDefault("indBolCon24", "--").toString(),
                        attributes.getOrDefault("indBolCon36", "--")
                ));
        return applicant;
    }
}
