package com.natwest.streamproject;

import java.util.ArrayList;
import java.util.List;

public class WrestlerImplementation {
    public long countAllWrestler(List<Wrestler> arrayLists){
        return arrayLists.stream().count();
    }
    public List<Wrestler> findAllWrestlerWhoseNameStartWithS(List<Wrestler> arrayLists) {
        List<Wrestler>arr = arrayLists.stream().filter(e->
    }
//    public long countOfAllWrestlerWhoseWeightIsGreaterThan200(List<Wrestler> arrayLists) {
//
//    }
//    public List<Wrestler> displayAllWrestlerNameInAscendingWhoseWeightIsGreaterThan150(List<Wrestler> arrayLists) {
//
//    }
//    public List<Wrestler> displayAllTheWrestlerBasedOnHeightInDescendingOrder(List<Wrestler> arrayLists) {
//
//    }


}
