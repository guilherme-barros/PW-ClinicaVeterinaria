package entity;


import enums.TipoAnimalEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ANIMAL")
@Getter
@Setter
public class Animal {
    @Id
    @Column(name = "IDANIMAL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_ANIMAL")
    private String nomeAnimal;

    @Column(name = "TIPO")
    private TipoAnimalEnum tipo;

    @Column(name = "RACA_ANIMAL")
    private String racaAnimal;

    @Column(name = "PESO")
    private double peso;

    @ManyToOne
    @JoinColumn(name = "IDTUTOR")
    private Cliente cliente;
}
