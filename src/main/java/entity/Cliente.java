package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTE")
@Getter
@Setter
public class Cliente {
    @Id
    @Column(name = "IDTUTOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_TUTOR")
    private String nomeTutor;

    @Column(name = "CELULAR_TUTOR")
    private String celular;

    @Column(name = "CPF_TUTOR")
    private String cpf;
}
