package com.polsl.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  Stores calculation data.
 */
@Entity
public class CalculationData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    char sign;
    String result;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String res) {
        this.result = res;
    }

    @Override
    public String toString() {
        return "entities.MatrixData[ id: " + id + "sign: " + sign + "]";
    }
}
