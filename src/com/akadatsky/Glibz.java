package com.akadatsky;

public class Glibz {
    private String vesselName;
    private int vesselCode;
    private ArrayList<String> crew = new ArrayList<>();

    public Glibz(String vesselName, int vesselCode) {
        this.vesselName = vesselName;
        this.vesselCode = vesselCode;
    }

    public String getVesselName() {
        return vesselName;
    }

    public int getVesselCode() {
        return vesselCode;
    }

    public ArrayList<String> getCrew() {
        return crew;
    }

    public void addCrewMember(String crewMember){
        this.crew.add(crewMember);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Glibz{" +
                "vesselName='" + vesselName + '\'' +
                ", vesselCode=" + vesselCode +
                ", crew=" + crew +
                '}';
    }
}
