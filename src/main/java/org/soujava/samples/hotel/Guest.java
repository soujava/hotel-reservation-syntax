package org.soujava.samples.hotel;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public record Guest (@Column String documentNumber, @Column String name) {
}
