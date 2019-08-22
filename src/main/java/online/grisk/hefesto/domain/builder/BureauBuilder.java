package online.grisk.hefesto.domain.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import online.grisk.hefesto.domain.entity.Applicant;
import online.grisk.hefesto.domain.entity.Attribute;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Map;

public class BureauBuilder {

    private static String useCaseGood = "{\"nconsultasrut_2\":\"0\",\"nhijos\":\"1\",\"cantantlab\":\"10\",\"nconsultasrut_6\":\"0\",\"nconsultasrut_12\":\"0\",\"nconsultasrut_24\":\"2\",\"nconsultasrut_36\":\"3\",\"edad\":\"21\",\"montrent\":\"1450000,00\",\"nprendas\":\"0\",\"cantubidom\":\"1\",\"cantacree_2\":\"0\",\"cantacree_6\":\"0\",\"cantacree_12\":\"0\",\"cantacree_24\":\"0\",\"cantacree_36\":\"1\",\"cantdoc_2\":\"0\",\"cantdoc_6\":\"0\",\"cantdoc_12\":\"0\",\"cantdoc_24\":\"0\",\"cantdoc_36\":\"0\",\"cantdocacl_2\":\"0\",\"cantdocacl_6\":\"0\",\"cantdocacl_12\":\"0\",\"cantdocacl_24\":\"0\",\"cantdocacl_36\":\"0\",\"cantdocnoac_2\":\"0\",\"cantdocnoac_6\":\"0\",\"cantdocnoac_12\":\"0\",\"cantdocnoac_24\":\"0\",\"cantdocnoac_36\":\"0\",\"montdoc_2\":\"0,00\",\"montdoc_6\":\"0,00\",\"montdoc_12\":\"0,00\",\"montdoc_24\":\"0,00\",\"montdoc_36\":\"0,00\",\"montdocacl_2\":\"0,00\",\"montdocacl_6\":\"0,00\",\"montdocacl_12\":\"0,00\",\"montdocacl_24\":\"0,00\",\"montdocacl_36\":\"0,00\",\"montdocnoac_2\":\"0,00\",\"montdocnoac_6\":\"0,00\",\"montdocnoac_12\":\"0,00\",\"montdocnoac_24\":\"0,00\",\"montdocnoac_36\":\"0,00\",\"cantccc_2\":\"3\",\"cantccc_6\":\"3\",\"cantccc_12\":\"3\",\"cantccc_24\":\"3\",\"cantccc_36\":\"3\",\"canttcc_2\":\"5\",\"canttcc_6\":\"5\",\"canttcc_12\":\"6\",\"canttcc_24\":\"6\",\"canttcc_36\":\"6\",\"puntscore_2\":\"981\",\"puntscore_6\":\"981\",\"puntscore_12\":\"981\",\"puntscore_24\":\"984\",\"puntscore_36\":\"990\",\"montbolcon_2\":\"0,00\",\"montbolcon_6\":\"0,00\",\"montbolcon_12\":\"0,00\",\"montbolcon_24\":\"0,00\",\"montbolcon_36\":\"0,00\"}";
    private static String useCaseMedium = "{\"nconsultasrut_2\":\"1\",\"nhijos\":\"2\",\"cantantlab\":\"2\",\"nconsultasrut_6\":\"2\",\"nconsultasrut_12\":\"3\",\"nconsultasrut_24\":\"4\",\"nconsultasrut_36\":\"6\",\"edad\":\"34\",\"montrent\":\"700000,00\",\"nprendas\":\"0\",\"cantubidom\":\"4\",\"cantacree_2\":\"1\",\"cantacree_6\":\"1\",\"cantacree_12\":\"1\",\"cantacree_24\":\"2\",\"cantacree_36\":\"2\",\"cantdoc_2\":\"1\",\"cantdoc_6\":\"1\",\"cantdoc_12\":\"1\",\"cantdoc_24\":\"1\",\"cantdoc_36\":\"2\",\"cantdocacl_2\":\"1\",\"cantdocacl_6\":\"1\",\"cantdocacl_12\":\"1\",\"cantdocacl_24\":\"1\",\"cantdocacl_36\":\"2\",\"cantdocnoac_2\":\"0\",\"cantdocnoac_6\":\"0\",\"cantdocnoac_12\":\"0\",\"cantdocnoac_24\":\"0\",\"cantdocnoac_36\":\"0\",\"montdoc_2\":\"658940,00\",\"montdoc_6\":\"658940,00\",\"montdoc_12\":\"658940,00\",\"montdoc_24\":\"658940,00\",\"montdoc_36\":\"2130980,00\",\"montdocacl_2\":\"658940,00\",\"montdocacl_6\":\"658940,00\",\"montdocacl_12\":\"658940,00\",\"montdocacl_24\":\"658940,00\",\"montdocacl_36\":\"2130980,00\",\"montdocnoac_2\":\"0,00\",\"montdocnoac_6\":\"0,00\",\"montdocnoac_12\":\"0,00\",\"montdocnoac_24\":\"0,00\",\"montdocnoac_36\":\"0,00\",\"cantccc_2\":\"1\",\"cantccc_6\":\"2\",\"cantccc_12\":\"3\",\"cantccc_24\":\"3\",\"cantccc_36\":\"3\",\"canttcc_2\":\"7\",\"canttcc_6\":\"8\",\"canttcc_12\":\"8\",\"canttcc_24\":\"8\",\"canttcc_36\":\"8\",\"puntscore_2\":\"660\",\"puntscore_6\":\"700\",\"puntscore_12\":\"754\",\"puntscore_24\":\"830\",\"puntscore_36\":\"810\",\"montbolcon_2\":\"0,00\",\"montbolcon_6\":\"0,00\",\"montbolcon_12\":\"0,00\",\"montbolcon_24\":\"0,00\",\"montbolcon_36\":\"0,00\"}";
    private static String useCaseBad = "{\"nconsultasrut_2\":\"14\",\"nhijos\":\"2\",\"cantantlab\":\"5\",\"nconsultasrut_6\":\"16\",\"nconsultasrut_12\":\"20\",\"nconsultasrut_24\":\"25\",\"nconsultasrut_36\":\"30\",\"edad\":\"52\",\"montrent\":\"310000,00\",\"nprendas\":\"2\",\"cantubidom\":\"21\",\"cantacree_2\":\"4\",\"cantacree_6\":\"4\",\"cantacree_12\":\"4\",\"cantacree_24\":\"4\",\"cantacree_36\":\"4\",\"cantdoc_2\":\"3\",\"cantdoc_6\":\"5\",\"cantdoc_12\":\"6\",\"cantdoc_24\":\"6\",\"cantdoc_36\":\"8\",\"cantdocacl_2\":\"2\",\"cantdocacl_6\":\"3\",\"cantdocacl_12\":\"3\",\"cantdocacl_24\":\"3\",\"cantdocacl_36\":\"3\",\"cantdocnoac_2\":\"1\",\"cantdocnoac_6\":\"2\",\"cantdocnoac_12\":\"3\",\"cantdocnoac_24\":\"3\",\"cantdocnoac_36\":\"5\",\"montdoc_2\":\"12909880,00\",\"montdoc_6\":\"21900000,00\",\"montdoc_12\":\"29900000,00\",\"montdoc_24\":\"29900000,00\",\"montdoc_36\":\"29900000,00\",\"montdocacl_2\":\"8909780,00\",\"montdocacl_6\":\"13456940,00\",\"montdocacl_12\":\"13456940,00\",\"montdocacl_24\":\"13456940,00\",\"montdocacl_36\":\"19765940,00\",\"montdocnoac_2\":\"3000100,00\",\"montdocnoac_6\":\"8409000,00\",\"montdocnoac_12\":\"8409000,00\",\"montdocnoac_24\":\"8409000,00\",\"montdocnoac_36\":\"10989000,00\",\"cantccc_2\":\"1\",\"cantccc_6\":\"3\",\"cantccc_12\":\"3\",\"cantccc_24\":\"3\",\"cantccc_36\":\"3\",\"canttcc_2\":\"12\",\"canttcc_6\":\"12\",\"canttcc_12\":\"12\",\"canttcc_24\":\"12\",\"canttcc_36\":\"14\",\"puntscore_2\":\"360\",\"puntscore_6\":\"420\",\"puntscore_12\":\"362\",\"puntscore_24\":\"400\",\"puntscore_36\":\"352\",\"montbolcon_2\":\"0,00\",\"montbolcon_6\":\"0,00\",\"montbolcon_12\":\"0,00\",\"montbolcon_24\":\"0,00\",\"montbolcon_36\":\"10989000,00\"}";
    private static String useCaseRandom = "{}";

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Applicant builder(@NotBlank String rut) throws IOException {
        if (rut.equalsIgnoreCase("18056934-0")) {
            return create(objectMapper.readValue(useCaseGood, Map.class), false);
        } else if (rut.equalsIgnoreCase("18248767-8")) {
            return create(objectMapper.readValue(useCaseMedium, Map.class), false);
        } else if (rut.equalsIgnoreCase("10853289-0")) {
            return create(objectMapper.readValue(useCaseBad, Map.class), false);
        } else {
            return create(objectMapper.readValue(useCaseRandom, Map.class), true);
        }
    }


    private static Applicant create(@NotNull Map<String, String> attributes, boolean isRandom) {
        Applicant applicant = null;
        if (!isRandom) {
            applicant = new Applicant(
                    new Attribute(
                            attributes.getOrDefault("nconsultasrut_2", "0").toString(),
                            attributes.getOrDefault("nconsultasrut_6", "0").toString(),
                            attributes.getOrDefault("nconsultasrut_12", "0").toString(),
                            attributes.getOrDefault("nconsultasrut_24", "0").toString(),
                            attributes.getOrDefault("nconsultasrut_36", "0").toString(),
                            attributes.getOrDefault("nhijos", "0").toString(),
                            attributes.getOrDefault("cantantlab", "0").toString(),
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
        }else{
            applicant = new Applicant(
                    Attribute.random());
        }
        return applicant;
    }
}
