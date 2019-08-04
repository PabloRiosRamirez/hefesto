package online.grisk.hefesto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Applicant {
    private Attribute attribute;
    private AdditionalAttribute additionalAttribute;

    public Applicant(Attribute attribute, AdditionalAttribute additionalAttribute) {
        this.attribute = attribute;
        this.additionalAttribute = additionalAttribute;
    }
}
