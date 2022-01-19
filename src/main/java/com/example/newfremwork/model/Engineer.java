package com.example.newfremwork.model;

public class Engineer {
    String name;
    String branch;
    int branchcode;


    public Engineer(String name, String branch, int branchcode) {
        this.name = name;
        this.branch = branch;
        this.branchcode = branchcode;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBranch() {

        return branch;
    }

    public void setBranch(String branch) {

        this.branch = branch;
    }

    public int getBranchcode() {

        return branchcode;
    }

    public void setBranchcode(int branchcode) {

        this.branchcode = branchcode;
    }


}
