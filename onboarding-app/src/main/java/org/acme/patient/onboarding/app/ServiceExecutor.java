package org.acme.patient.onboarding.app;

import io.temporal.activity.ActivityInterface;
import org.acme.patient.onboarding.model.Doctor;
import org.acme.patient.onboarding.model.Hospital;
import org.acme.patient.onboarding.model.Patient;

@ActivityInterface
public interface ServiceExecutor {
    Hospital assignHospitalToPatient(String zip);
    Doctor assignDoctorToPatient(String condition);
    String finalizeOnboarding();
    void notifyViaEmail(String email);
    void notifyViaText(String number);
    Patient compensateOnboarding(Patient patient);
}
