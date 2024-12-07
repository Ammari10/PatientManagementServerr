package patientmanagementservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import patientmanagementservice.Entities.Patient;
import patientmanagementservice.Repositories.PatientRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient("Achraf", "Achraf@gmail.com", "Check-up"));
            patientRepository.save(new Patient("Hiba", "hiba@gmail.com", "Scanner"));
            patientRepository.save(new Patient("Ayoub", "ayoub@gmail.com", "Medical analysis"));
            patientRepository.save(new Patient("Rayane", "rayane@gmail.com", "Check-up"));
        };
    }

}
