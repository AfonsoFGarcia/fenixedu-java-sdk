package org.fenixedu.sdk.android;

import org.fenixedu.sdk.FenixEduClient;

import com.google.gson.JsonArray;

/**
 * This endpoint returns the informations for a degree's courses.
 * If no academicTerm is defined it returns the degree information for the currentAcademicTerm.
 */
public class GetDegreeCoursesAsyncTask extends FenixEduAsyncTask<String, JsonArray> {

    public GetDegreeCoursesAsyncTask(FenixEduClient client) {
        super(client);
    }

    @Override
    protected JsonArray doInBackground(String... params) {
        if (params.length == 1) {
            return getClient().publicScope().getDegreeCourses(params[0]);
        } else {
            return getClient().publicScope().getDegreeCourses(params[0], params[1]);
        }
    }
}
