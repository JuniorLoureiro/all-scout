package com.example.senac.Model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum Posicao {
    @Enumerated(EnumType.STRING)
    GOLEIRO,
    @Enumerated(EnumType.STRING)
    LATERAL,
    @Enumerated(EnumType.STRING)
    ZAGUEIRO,
    @Enumerated(EnumType.STRING)
    VOLANTE,
    @Enumerated(EnumType.STRING)
    MEIA,
    @Enumerated(EnumType.STRING)
    PONTA,
    @Enumerated(EnumType.STRING)
    ATACANTE,
}