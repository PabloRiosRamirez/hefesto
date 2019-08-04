package online.grisk.hefesto.domain.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.grisk.hefesto.domain.entity.AdditionalAttribute;
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

        return new Applicant(
                new Attribute(attributes.getOrDefault("indTotDoc02", "--"),
                        attributes.getOrDefault("indTotDoc06", "--"),
                        attributes.getOrDefault("indTotDoc12", "--"),
                        attributes.getOrDefault("indTotDocA02", "--"),
                        attributes.getOrDefault("indTotDocA06", "--"),
                        attributes.getOrDefault("indTotDocA12", "--"),
                        attributes.getOrDefault("indTotDocNA02", "--"),
                        attributes.getOrDefault("indTotDocNA06", "--"),
                        attributes.getOrDefault("indTotDocNA12", "--"),
                        attributes.getOrDefault("indMontDoc02", "--"),
                        attributes.getOrDefault("indMontDoc06", "--"),
                        attributes.getOrDefault("indMontDoc12", "--"),
                        attributes.getOrDefault("indMontDocA02", "--"),
                        attributes.getOrDefault("indMontDocA06", "--"),
                        attributes.getOrDefault("indMontDocA12", "--"),
                        attributes.getOrDefault("indMontDocNA02", "--"),
                        attributes.getOrDefault("indMontDocNA06", "--"),
                        attributes.getOrDefault("indMontDocNA12", "--"),
                        attributes.getOrDefault("indCantCC02", "--"),
                        attributes.getOrDefault("indCantCC06", "--"),
                        attributes.getOrDefault("indCantCC12", "--"),
                        attributes.getOrDefault("indCantTC02", "--"),
                        attributes.getOrDefault("indCantTC06", "--"),
                        attributes.getOrDefault("indCantTC12", "--"),
                        attributes.getOrDefault("indDicScore02", "--"),
                        attributes.getOrDefault("indDicScore06", "--"),
                        attributes.getOrDefault("indDicScore12", "--"),
                        attributes.getOrDefault("indBolCom02", "--"),
                        attributes.getOrDefault("indBolCom06", "--"),
                        attributes.getOrDefault("indBolCom12", "--"),
                        attributes.getOrDefault("indDiasAtrRcc02", "--"),
                        attributes.getOrDefault("indDiasAtrRcc06", "--"),
                        attributes.getOrDefault("indDiasAtrRcc12", "--"),
                        attributes.getOrDefault("indUltConst", "--"),
                        attributes.getOrDefault("indCantSocios", "--"),
                        attributes.getOrDefault("indBedSocios", "--"),
                        attributes.getOrDefault("indBolComSocios", "--"),
                        attributes.getOrDefault("indCantPersonasHH", "--"),
                        attributes.getOrDefault("indVehAvalTotal", "--"),
                        attributes.getOrDefault("indBbrrAvalTotal", "--"),
                        attributes.getOrDefault("indNroAcreed", "--"),
                        attributes.getOrDefault("indBolConc", "--")
                ),
                new AdditionalAttribute(
                        additionalAttributes.getOrDefault("name", "--").toString(),
                        additionalAttributes.getOrDefault("apePad", "--").toString(),
                        additionalAttributes.getOrDefault("apeMat", "--").toString(),
                        additionalAttributes.getOrDefault("indEdad", "--").toString(),
                        additionalAttributes.getOrDefault("indSexo", "--").toString(),
                        additionalAttributes.getOrDefault("indTieneFDEF", "--").toString(),
                        additionalAttributes.getOrDefault("indTotVehs", "--").toString(),
                        additionalAttributes.getOrDefault("indGrpSocEc", "--").toString(),
                        additionalAttributes.getOrDefault("indNacionalidad", "--").toString(),
                        additionalAttributes.getOrDefault("indEstCiv", "--").toString(),
                        additionalAttributes.getOrDefault("indNroHij", "--").toString(),
                        additionalAttributes.getOrDefault("indCiudad", "--").toString(),
                        additionalAttributes.getOrDefault("indComuna", "--").toString(),
                        additionalAttributes.getOrDefault("indNivelEduc", "--").toString()));
    }
}
