package project.hrms.core.adapters;

import org.springframework.stereotype.Service;
import project.hrms.core.adapters.MernisServiceReference.NCEKPSPublicSoap;

import project.hrms.entities.concretes.Candidate;

@Service
public class MernisServiceAdapter  {

    NCEKPSPublicSoap client = new NCEKPSPublicSoap();

    public boolean CheckIfRealPerson(Candidate candidate) throws Exception {
        boolean result = client.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
                candidate.getFirstName(),
                candidate.getLastName(),
                Integer.parseInt(candidate.getBirthYear()));

       return result;

    }


}
