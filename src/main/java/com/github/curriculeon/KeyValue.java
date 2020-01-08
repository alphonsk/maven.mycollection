package com.github.curriculeon;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyValue<KeyType, ValueType> {
    private KeyType keyType;
    private  ValueType valueType;


    public KeyValue(KeyType key, ValueType value) {
        this.keyType = key;
        this.valueType = value;
    }

    public KeyType getKey() {
        return this.keyType;
    }

    public ValueType getValue() {
        return this.valueType;
    }

    public void setKey(KeyType key) {
        this.keyType = key;
    }

    public void setValue(ValueType value) {
        this.valueType = value;
    }
}
