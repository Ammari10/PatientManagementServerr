package patientmanagementservice.Entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data

@AllArgsConstructor

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String email;
    private String descriptionDiagnostic;

    public Patient() {

    }
}