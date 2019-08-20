package online.grisk.hefesto.domain.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.grisk.hefesto.domain.entity.Applicant;
import online.grisk.hefesto.domain.entity.Attribute;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Map;

public class BureauBuilder {

    private static String useCaseGood = "";
    private static String useCaseMedium = "";
    private static String useCaseBad = "";

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Applicant builder(@NotBlank String rut) throws IOException {
        Map atributte = objectMapper.readValue(useCaseGood, Map.class);
        return create(atributte);
    }


    private static Applicant create(@NotNull Map<String, String> attributes) {
        Applicant applicant = new Applicant(
                new Attribute(
                        attributes.getOrDefault("NCONSULTASRUT", "0").toString(),
                        attributes.getOrDefault("NHIJOS", "0").toString(),
                        attributes.getOrDefault("CANTDEUPREV", "0").toString(),
                        attributes.getOrDefault("EDAD", "0").toString(),
                        attributes.getOrDefault("MONTRENT", "0").toString(),
                        attributes.getOrDefault("NPRENDAS", "0").toString(),
                        attributes.getOrDefault("CANTUBIDOM", "0").toString(),
                        attributes.getOrDefault("CANTACREE_2", "0").toString(),
                        attributes.getOrDefault("CANTACREE_6", "0").toString(),
                        attributes.getOrDefault("CANTACREE_12", "0").toString(),
                        attributes.getOrDefault("CANTACREE_24", "0").toString(),
                        attributes.getOrDefault("CANTACREE_36", "0").toString(),
                        attributes.getOrDefault("CANTDOC_2", "0").toString(),
                        attributes.getOrDefault("CANTDOC_6", "0").toString(),
                        attributes.getOrDefault("CANTDOC_12", "0").toString(),
                        attributes.getOrDefault("CANTDOC_24", "0").toString(),
                        attributes.getOrDefault("CANTDOC_36", "0").toString(),
                        attributes.getOrDefault("CANTDOCACL_2", "0").toString(),
                        attributes.getOrDefault("CANTDOCACL_6", "0").toString(),
                        attributes.getOrDefault("CANTDOCACL_12", "0").toString(),
                        attributes.getOrDefault("CANTDOCACL_24", "0").toString(),
                        attributes.getOrDefault("CANTDOCACL_36", "0").toString(),
                        attributes.getOrDefault("CANTDOCNOAC_2", "0").toString(),
                        attributes.getOrDefault("CANTDOCNOAC_6", "0").toString(),
                        attributes.getOrDefault("CANTDOCNOAC_12", "0").toString(),
                        attributes.getOrDefault("CANTDOCNOAC_24", "0").toString(),
                        attributes.getOrDefault("CANTDOCNOAC_36", "0").toString(),
                        attributes.getOrDefault("MONTDOC_2", "0,00").toString(),
                        attributes.getOrDefault("MONTDOC_6", "0,00").toString(),
                        attributes.getOrDefault("MONTDOC_12", "0,00").toString(),
                        attributes.getOrDefault("MONTDOC_24", "0,00").toString(),
                        attributes.getOrDefault("MONTDOC_36", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCACL_2", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCACL_6", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCACL_12", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCACL_24", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCACL_36", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCNOAC_2", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCNOAC_6", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCNOAC_12", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCNOAC_24", "0,00").toString(),
                        attributes.getOrDefault("MONTDOCNOAC_36", "0,00").toString(),
                        attributes.getOrDefault("CANTCCC_2", "0").toString(),
                        attributes.getOrDefault("CANTCCC_6", "0").toString(),
                        attributes.getOrDefault("CANTCCC_12", "0").toString(),
                        attributes.getOrDefault("CANTCCC_24", "0").toString(),
                        attributes.getOrDefault("CANTCCC_36", "0").toString(),
                        attributes.getOrDefault("CANTTCC_2", "0").toString(),
                        attributes.getOrDefault("CANTTCC_6", "0").toString(),
                        attributes.getOrDefault("CANTTCC_12", "0").toString(),
                        attributes.getOrDefault("CANTTCC_24", "0").toString(),
                        attributes.getOrDefault("CANTTCC_36", "0").toString(),
                        attributes.getOrDefault("PUNTSCORE_2", "0").toString(),
                        attributes.getOrDefault("PUNTSCORE_6", "0").toString(),
                        attributes.getOrDefault("PUNTSCORE_12", "0").toString(),
                        attributes.getOrDefault("PUNTSCORE_24", "0").toString(),
                        attributes.getOrDefault("PUNTSCORE_36", "0").toString(),
                        attributes.getOrDefault("MONTBOLCON_2", "0,00").toString(),
                        attributes.getOrDefault("MONTBOLCON_6", "0,00").toString(),
                        attributes.getOrDefault("MONTBOLCON_12", "0,00").toString(),
                        attributes.getOrDefault("MONTBOLCON_24", "0,00").toString(),
                        attributes.getOrDefault("MONTBOLCON_36", "0,00").toString()
                ));
        return applicant;
    }
}
