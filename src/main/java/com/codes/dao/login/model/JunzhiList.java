package com.codes.dao.login.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sort")
public class JunzhiList {
    @Id
    private String id;
    private String name;
    private double end;
    private double max;
    private double start;
    private double prend;
    private double addv;
    private double add;
    private double change;
    private double trading;
    private double tradingv;
    private double count;
    private double market;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getPrend() {
        return prend;
    }

    public void setPrend(double prend) {
        this.prend = prend;
    }

    public double getAddv() {
        return addv;
    }

    public void setAddv(double addv) {
        this.addv = addv;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getTrading() {
        return trading;
    }

    public void setTrading(double trading) {
        this.trading = trading;
    }

    public double getTradingv() {
        return tradingv;
    }

    public void setTradingv(double tradingv) {
        this.tradingv = tradingv;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getMarket() {
        return market;
    }

    public void setMarket(double market) {
        this.market = market;
    }
}
