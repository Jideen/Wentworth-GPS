package edu.wit.leapordnav;

public class Tree {
    int branch;
    int leave;
    double cell;
    double xCord;
    String tag;

    Tree() {
        this("default", 0, 0, 0., 0.);
    }

    Tree(String n0, int n1, int n2, double n3, double n4) {
    	tag = n0;
        branch = n1;
        leave = n2;
        cell = n3;
        xCord = n4;
    }

    getBranch(){
    	return branch;
    }

    getLeave(){
    	return leave;
    }

    getCell(){
    	return cell;
    }

    getXcord(){
    	return xCord;
    }

    getTag(){
    	return tag;
    }
}
