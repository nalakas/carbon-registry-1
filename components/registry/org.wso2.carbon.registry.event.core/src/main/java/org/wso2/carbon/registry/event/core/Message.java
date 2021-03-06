/*
 * Copyright 2015 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.registry.event.core;

import org.apache.axiom.om.OMElement;

import java.util.Map;
import java.util.HashMap;

/**
 * this class is used to keep the OMMessage and 
 */
public class Message {

    private Map<String, String> properties;

    private OMElement message;

    public Message() {
        this.properties = new HashMap();
    }

    public void addProperty(String key, String value){
        this.properties.put(key, value);
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public OMElement getMessage() {
        return message;
    }

    public void setMessage(OMElement message) {
        this.message = message;
    }

    public String getProperty(String propertyName){
        return this.properties.get(propertyName);
    }
}
