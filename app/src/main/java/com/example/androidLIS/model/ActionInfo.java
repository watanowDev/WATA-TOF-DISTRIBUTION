package com.example.androidLIS.model;

public class ActionInfo {
    public String workLocationId;
    public String action;
    public String vehicleId;
    public String epc;
    public String shelf;
    public String height;
    public String loadId;
    public String loadRate;
    public String loadMatrixRaw;
    public String loadMatrixColumn;
    public int[] loadMatrix;

    public ActionInfo(String wid,
                      String ac,
                      String vid,
                      String ep,
                      String sp,
                      String h,
                      String lid,
                      String lR,
                      String lMR,
                      String lMC,
                      int[] lM) {
        workLocationId = wid;
        action = ac;
        vehicleId = vid;
        epc = ep;
        shelf = sp;
        height =h;
        loadId = lid;
        loadRate = lR;
        loadMatrixRaw = lMR;
        loadMatrixColumn = lMC;
        loadMatrix = lM;
    }


}
