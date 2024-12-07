package patientmanagementservice.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import patientmanagementservice.Dtos.PatientDto;
import patientmanagementservice.Entities.Patient;

@Component
public class PatientMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public Patient fromPatientDtoPatientEntity (PatientDto patientDto){
            Patient patient =modelMapper.map(patientDto,Patient.class);
            return patient;
    }
}
