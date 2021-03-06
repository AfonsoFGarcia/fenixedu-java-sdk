package org.fenixedu.sdk.android;

import org.fenixedu.sdk.FenixEduClient;

import com.google.gson.JsonObject;

/**
 * This endpoint returns some basic information about the institution where the application is deployed.
 * It also returns a list of RSS feeds, the current academic term, available languages and default language.
 */
public class GetAboutAsyncTask extends FenixEduAsyncTask<Void, JsonObject> {

    public GetAboutAsyncTask(FenixEduClient client) {
        super(client);
    }

    @Override
    protected JsonObject doInBackground(Void... params) {
        return getClient().publicScope().getAbout();
    }

}
