package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonObjects;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        jsonObjects = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        HashMap<String, Object> details = new HashMap<String, Object>();
        details.put("ISBN", b.getISBN());
        details.put("Title", b.getTitle());
        details.put("Publisher", b.getPublisher());
        details.put("Authors", b.getAuthors());

        String authors = String.join("|", b.getAuthors());
        details.put("Authors", authors);

        jsonObjects.add(new JSONObject(details));
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonObjects.toJSONString();
    }
}
