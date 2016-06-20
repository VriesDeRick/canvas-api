package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.enums.EnrollmentType;
import edu.ksu.canvas.exception.InvalidOauthTokenException;
import edu.ksu.canvas.model.Enrollment;

import java.io.IOException;
import java.util.List;

/**
 * Created by prv on 10/8/15.
 */
public interface EnrollmentsReader extends CanvasReader<Enrollment, EnrollmentsReader> {
    /**
     *
     * @param userId
     * @return
     * @throws InvalidOauthTokenException
     * @throws IOException
     */
     List<Enrollment> getUserEnrollments(String userId) throws InvalidOauthTokenException, IOException;


     List<Enrollment> getSectionEnrollments(String sectionId, List<EnrollmentType> enrollmentTypes) throws InvalidOauthTokenException, IOException;

}
