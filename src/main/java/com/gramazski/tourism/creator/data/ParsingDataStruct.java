package com.gramazski.tourism.creator.data;

/**
 * Created by gs on 18.12.2016.
 */
public class ParsingDataStruct {
    private String entityName;
    private String[] parameters;

    public ParsingDataStruct(String entityName, String[] parameters){
        this.entityName = entityName;
        this.parameters = parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityName() {
        return entityName;
    }

    public String[] getParameters() {
        return parameters;
    }
}
