package com.polsl.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  Stores matrices which are results of calculations.
 */
@Entity
public class MatrixData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String values;
    private int calcId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public int getCalcId() {
        return calcId;
    }

    public void setCalcId(int id) {
        this.calcId = id;
    }

    @Override
    public String toString() {
        return "entities.MatrixData[ id: " + id + "values: " + values + "]";
    }
}
