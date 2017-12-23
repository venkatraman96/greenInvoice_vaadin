package com.greenInvoice.biz.entity;

/**
 * DataRequest Entity to perform ajax calls.
 * 
 * @author Venkatraman
 *
 */
public class DataRequest {
    /**
     * value1
     */
    private Integer value1;
    
    /**
     * value2
     */
    private Integer value2;
    
    /**
     * 
     * @return value1
     */
    public Integer getValue1() {
        return value1;
    }
    
    /**
     * 
     * @param value1
     */
    public void setValue1(Integer value1) {
        this.value1 = value1; 
    }
    
    /**
     * 
     * @return value2
     */
    public Integer getValue2() {
        return value2;
    }
    
    /**
     * 
     * @param value2
     */
    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
}