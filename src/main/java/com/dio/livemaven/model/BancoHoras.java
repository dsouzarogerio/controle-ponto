package com.dio.livemaven.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public class BancoHorasId implements Serializable {

        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;

    private LocalDateTime dataTrabahada;

    private BigDecimal quantidadeHorasTrabalhadas;

    private BigDecimal saldoHorasTrabalhadas;
}