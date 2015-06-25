package com.appspot.model.search;

import com.framework.util.collection.DataCollection;
import com.framework.util.search.EntityField;
import com.framework.util.search.EntityFieldType;
import com.framework.util.search.EntitySearchMap;

public class MovieSearchMap implements EntitySearchMap {

    private DataCollection<String, EntityField> fields;

    public DataCollection<String, EntityField> getFields() {
        fields = new DataCollection<String, EntityField>();
        // generator:fields
		fields.put("id", new EntityField("Id", "id", EntityFieldType.INT));
		fields.put("id", new EntityField("Id", "id", EntityFieldType.LONG));
		fields.put("date", new EntityField("Date", "date", EntityFieldType.DATE));
		fields.put("title", new EntityField("Title", "title", EntityFieldType.STRING));
		fields.put("genre", new EntityField("Genre", "genre", EntityFieldType.STRING));
		fields.put("url", new EntityField("Url", "url", EntityFieldType.STRING));
		fields.put("catalogNo", new EntityField("CatalogNo", "catalogNo", EntityFieldType.STRING));
		fields.put("upc", new EntityField("Upc", "upc", EntityFieldType.STRING));


        return fields;
    }
    
}

