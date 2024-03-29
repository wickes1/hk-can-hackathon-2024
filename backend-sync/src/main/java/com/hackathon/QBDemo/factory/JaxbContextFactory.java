package com.hackathon.QBDemo.factory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;

public class JaxbContextFactory {
    private static final Map<String, JAXBContext> JAXBMap = new HashMap<>();

    public static JAXBContext getJAXBContext(Class<?> clazz) throws JAXBException {
        if(JAXBMap.get(clazz.getCanonicalName()) != null) {
            return JAXBMap.get(clazz.getCanonicalName());
        }else {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            JAXBMap.put(clazz.getCanonicalName(), jaxbContext);
            return jaxbContext;
        }
    }
}
