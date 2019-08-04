package online.grisk.hefesto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Applicant {
    private Attribute attribute;

    public Applicant(Attribute attribute) {
        this.attribute = attribute;
    }
}
