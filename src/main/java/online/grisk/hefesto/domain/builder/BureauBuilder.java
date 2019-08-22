package online.grisk.hefesto.domain.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.grisk.hefesto.domain.entity.Applicant;
import online.grisk.hefesto.domain.entity.Attribute;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Map;

public class BureauBuilder {

    private static String useCaseGood = "{\"nconsultasrut_2\":\"0\",\"nhijos\":\"1\",\"cantdeuprev\":\"0\",\"nconsultasrut_6\":\"0\",\"nconsultasrut_12\":\"0\",\"nconsultasrut_24\":\"2\",\"nconsultasrut_36\":\"3\",\"edad\":\"21\",\"montrent\":\"1450000,00\",\"nprendas\":\"0\",\"cantubidom\":\"1\",\"cantacree_2\":\"0\",\"cantacree_6\":\"0\",\"cantacree_12\":\"0\",\"cantacree_24\":\"0\",\"cantacree_36\":\"1\",\"cantdoc_2\":\"0\",\"cantdoc_6\":\"0\",\"cantdoc_12\":\"0\",\"cantdoc_24\":\"0\",\"cantdoc_36\":\"0\",\"cantdocacl_2\":\"0\",\"cantdocacl_6\":\"0\",\"cantdocacl_12\":\"0\",\"cantdocacl_24\":\"0\",\"cantdocacl_36\":\"0\",\"cantdocnoac_2\":\"0\",\"cantdocnoac_6\":\"0\",\"cantdocnoac_12\":\"0\",\"cantdocnoac_24\":\"0\",\"cantdocnoac_36\":\"0\",\"montdoc_2\":\"0,00\",\"montdoc_6\":\"0,00\",\"montdoc_12\":\"0,00\",\"montdoc_24\":\"0,00\",\"montdoc_36\":\"0,00\",\"montdocacl_2\":\"0,00\",\"montdocacl_6\":\"0,00\",\"montdocacl_12\":\"0,00\",\"montdocacl_24\":\"0,00\",\"montdocacl_36\":\"0,00\",\"montdocnoac_2\":\"0,00\",\"montdocnoac_6\":\"0,00\",\"montdocnoac_12\":\"0,00\",\"montdocnoac_24\":\"0,00\",\"montdocnoac_36\":\"0,00\",\"cantccc_2\":\"3\",\"cantccc_6\":\"3\",\"cantccc_12\":\"3\",\"cantccc_24\":\"3\",\"cantccc_36\":\"3\",\"canttcc_2\":\"5\",\"canttcc_6\":\"5\",\"canttcc_12\":\"6\",\"canttcc_24\":\"6\",\"canttcc_36\":\"6\",\"puntscore_2\":\"981\",\"puntscore_6\":\"981\",\"puntscore_12\":\"981\",\"puntscore_24\":\"984\",\"puntscore_36\":\"990\",\"montbolcon_2\":\"0,00\",\"montbolcon_6\":\"0,00\",\"montbolcon_12\":\"0,00\",\"montbolcon_24\":\"0,00\",\"montbolcon_36\":\"0,00\"}";
    private static String useCaseMedium = "{}";
    private static String useCaseBad = "{}";
    private static String useCaseRandom = "{}";

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Applicant builder(@NotBlank String rut) throws IOException {
        if(rut.equalsIgnoreCase("18056934-0")){
            return create(objectMapper.readValue(useCaseGood, Map.class));
        }else if(rut.equalsIgnoreCase("18248767-8")){
            return create(objectMapper.readValue(useCaseMedium, Map.class));
        }else if(rut.equalsIgnoreCase("10853289-0")){
            return create(objectMapper.readValue(useCaseBad, Map.class));
        } else{
            return create(objectMapper.readValue(useCaseRandom, Map.class));
        }

    }


    private static Applicant create(@NotNull Map<String, String> attributes) {
        Applicant applicant = new Applicant(
                new Attribute(
                        attributes.getOrDefault("nconsultasrut_2", "0").toString(),
                        attributes.getOrDefault("nconsultasrut_6", "0").toString(),
                        attributes.getOrDefault("nconsultasrut_12", "0").toString(),
                        attributes.getOrDefault("nconsultasrut_24", "0").toString(),
                        attributes.getOrDefault("nconsultasrut_36", "0").toString(),
                        attributes.getOrDefault("nhijos", "0").toString(),
                        attributes.getOrDefault("cantdeuprev", "0").toString(),
                        attributes.getOrDefault("edad", "0").toString(),
                        attributes.getOrDefault("montrent", "0").toString(),
                        attributes.getOrDefault("nprendas", "0").toString(),
                        attributes.getOrDefault("cantubidom", "0").toString(),
                        attributes.getOrDefault("cantacree_2", "0").toString(),
                        attributes.getOrDefault("cantacree_6", "0").toString(),
                        attributes.getOrDefault("cantacree_12", "0").toString(),
                        attributes.getOrDefault("cantacree_24", "0").toString(),
                        attributes.getOrDefault("cantacree_36", "0").toString(),
                        attributes.getOrDefault("cantdoc_2", "0").toString(),
                        attributes.getOrDefault("cantdoc_6", "0").toString(),
                        attributes.getOrDefault("cantdoc_12", "0").toString(),
                        attributes.getOrDefault("cantdoc_24", "0").toString(),
                        attributes.getOrDefault("cantdoc_36", "0").toString(),
                        attributes.getOrDefault("cantdocacl_2", "0").toString(),
                        attributes.getOrDefault("cantdocacl_6", "0").toString(),
                        attributes.getOrDefault("cantdocacl_12", "0").toString(),
                        attributes.getOrDefault("cantdocacl_24", "0").toString(),
                        attributes.getOrDefault("cantdocacl_36", "0").toString(),
                        attributes.getOrDefault("cantdocnoac_2", "0").toString(),
                        attributes.getOrDefault("cantdocnoac_6", "0").toString(),
                        attributes.getOrDefault("cantdocnoac_12", "0").toString(),
                        attributes.getOrDefault("cantdocnoac_24", "0").toString(),
                        attributes.getOrDefault("cantdocnoac_36", "0").toString(),
                        attributes.getOrDefault("montdoc_2", "0,00").toString(),
                        attributes.getOrDefault("montdoc_6", "0,00").toString(),
                        attributes.getOrDefault("montdoc_12", "0,00").toString(),
                        attributes.getOrDefault("montdoc_24", "0,00").toString(),
                        attributes.getOrDefault("montdoc_36", "0,00").toString(),
                        attributes.getOrDefault("montdocacl_2", "0,00").toString(),
                        attributes.getOrDefault("montdocacl_6", "0,00").toString(),
                        attributes.getOrDefault("montdocacl_12", "0,00").toString(),
                        attributes.getOrDefault("montdocacl_24", "0,00").toString(),
                        attributes.getOrDefault("montdocacl_36", "0,00").toString(),
                        attributes.getOrDefault("montdocnoac_2", "0,00").toString(),
                        attributes.getOrDefault("montdocnoac_6", "0,00").toString(),
                        attributes.getOrDefault("montdocnoac_12", "0,00").toString(),
                        attributes.getOrDefault("montdocnoac_24", "0,00").toString(),
                        attributes.getOrDefault("montdocnoac_36", "0,00").toString(),
                        attributes.getOrDefault("cantccc_2", "0").toString(),
                        attributes.getOrDefault("cantccc_6", "0").toString(),
                        attributes.getOrDefault("cantccc_12", "0").toString(),
                        attributes.getOrDefault("cantccc_24", "0").toString(),
                        attributes.getOrDefault("cantccc_36", "0").toString(),
                        attributes.getOrDefault("canttcc_2", "0").toString(),
                        attributes.getOrDefault("canttcc_6", "0").toString(),
                        attributes.getOrDefault("canttcc_12", "0").toString(),
                        attributes.getOrDefault("canttcc_24", "0").toString(),
                        attributes.getOrDefault("canttcc_36", "0").toString(),
                        attributes.getOrDefault("puntscore_2", "0").toString(),
                        attributes.getOrDefault("puntscore_6", "0").toString(),
                        attributes.getOrDefault("puntscore_12", "0").toString(),
                        attributes.getOrDefault("puntscore_24", "0").toString(),
                        attributes.getOrDefault("puntscore_36", "0").toString(),
                        attributes.getOrDefault("montbolcon_2", "0,00").toString(),
                        attributes.getOrDefault("montbolcon_6", "0,00").toString(),
                        attributes.getOrDefault("montbolcon_12", "0,00").toString(),
                        attributes.getOrDefault("montbolcon_24", "0,00").toString(),
                        attributes.getOrDefault("montbolcon_36", "0,00").toString()
                ));
        return applicant;
    }
}
