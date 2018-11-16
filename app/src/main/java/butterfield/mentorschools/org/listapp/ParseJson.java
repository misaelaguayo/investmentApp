package butterfield.mentorschools.org.listapp;

import org.json.JSONException;
import org.json.JSONObject;

public class ParseJson {
    String in;

    ParseJson(String in) throws JSONException {
        this.in = in;
    }

    public String parse() throws JSONException {
        JSONObject reader = new JSONObject(in);
        JSONObject Open = reader.getJSONObject("Open");
        String open = Open.toString();

        return open;
    }



}
