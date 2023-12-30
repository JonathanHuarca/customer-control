package mv.com.gm.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty //campo obligatorio para string
    @Email
    private String email;
    
    private String telefono;
    
    @NotNull //campo obligatorio para numeros entre otros
    private Double saldo;
}
