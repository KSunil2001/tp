package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_DISCHARGE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DISCHARGE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NRIC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NRIC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STATUS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_STATUS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WARD_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WARD_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.patient.Patient;
import seedu.address.model.ward.Ward;

/**
 * A utility class containing a list of {@code Patient} objects to be used in tests.
 */
public class TypicalPatients {

    // Patients
    public static final Patient ALEX = new PatientBuilder().withNric("S1334567A")
            .withName("Alex Smith").withStatus("GRAY").withWard("Waiting Room").withDischarge("12/02/2023 1400").build();
    public static final Patient BENSON = new PatientBuilder().withNric("S7654321F")
            .withName("Benson Tillman").withStatus("GRAY").withWard("Waiting Room").withDischarge("12/02/2023 1500").build();
    public static final Patient CARL = new PatientBuilder().withNric("S2468024G")
            .withName("Carl Leigh").withStatus("GREEN").withWard("Class A").withDischarge("12/02/2023 1600").build();
    public static final Patient DANIEL = new PatientBuilder().withNric("S1244567A")
            .withName("Daniel Wellington").withStatus("YELLOW").withWard("Class B").withDischarge("13/02/2023 1400").build();
    public static final Patient ELLE = new PatientBuilder().withNric("S1235567A")
            .withName("Elle Schmidt").withStatus("GREEN").withWard("Class C").withDischarge("13/02/2023 1500").build();
    public static final Patient FIONA = new PatientBuilder().withNric("S6969696B")
            .withName("Fiona Shrekt").withStatus("RED").withWard("ICU").withDischarge("13/02/2023 1600").build();
    public static final Patient GEORGE = new PatientBuilder().withNric("S1224567A")
            .withName("George Townsend").withStatus("RED").withWard("ICU").withDischarge("14/02/2023 1400").build();

    // Wards
    public static final Ward WaitingRoom = new Ward("Waiting Room");
    public static final Ward A = new Ward("Class A");
    public static final Ward B = new Ward("Class B");
    public static final Ward C = new Ward("Class C");
    public static final Ward ICU = new Ward("ICU");

    // Manually added
    public static final Patient HOON = new PatientBuilder().withName("Hoon Meier").withNric("T2222222L")
            .withStatus("GREEN").withWard("C1").withDischarge("22/02/2023 1540").build();
    public static final Patient IDA = new PatientBuilder().withName("Ida Mueller").withNric("S3333333L")
            .withStatus("YELLOW").withWard("B2").withDischarge("25/02/2023 1400").build();

    // Manually added - Patient's details found in {@code CommandTestUtil}
    public static final Patient AMY = new PatientBuilder().withName(VALID_NAME_AMY).withNric(VALID_NRIC_AMY)
            .withStatus(VALID_STATUS_AMY).withWard(VALID_WARD_AMY).withDischarge(VALID_DISCHARGE_AMY).build();
    public static final Patient BOB = new PatientBuilder().withName(VALID_NAME_BOB).withNric(VALID_NRIC_BOB)
            .withStatus(VALID_STATUS_BOB).withWard(VALID_WARD_BOB).withDischarge(VALID_DISCHARGE_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPatients() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();

        for (Ward ward : getTypicalWards()) {
            ab.addWard(ward);
        }

        for (Patient patient : getTypicalPatients()) {
            ab.addPatient(patient);
        }
        return ab;
    }

    public static List<Patient> getTypicalPatients() {
        return new ArrayList<>(Arrays.asList(ALEX, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }

    public static List<Ward> getTypicalWards() {
        return new ArrayList<>(Arrays.asList(WaitingRoom, A, B, C, ICU));
    }
}
