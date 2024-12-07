package patientmanagementservice.Web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import patientmanagementservice.Dtos.PatientDto;
import patientmanagementservice.Entities.Patient;
import patientmanagementservice.Repositories.PatientRepository;
import patientmanagementservice.mapper.PatientMapper;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    private PatientRepository patientRepository;
    private PatientMapper patientMapper;

    public List<Patient> patientList() { return patientRepository.findAll();}
    @WebMethod
    public Patient patientByname (@WebParam (name = "name")Long id) { return patientRepository.findById(patientByname('')).get();}
    @WebMethod
    public  Patient savePatient (@WebParam (name="patient") PatientDto patientDto){
        Patient patient = patientMapper.fromPatientDtoPatientEntity(patientDto);
        return  patientRepository.save (patient);
    }
}
