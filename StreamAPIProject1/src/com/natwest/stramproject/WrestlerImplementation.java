package com.natwest.stramproject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WrestlerImplementation {
    public long countAllWrestler(List<Wrestler> arrayLists){
        return arrayLists.stream().count();
    }
    public List<Wrestler> findAllWrestlerWhoseNameStartWithS(List<Wrestler> arrayLists) {
        return arrayLists.stream().filter(i->i.getName().startsWith("S")).collect(Collectors.toList());
    }
    public long countOfAllWrestlerWhoseWeightIsGreaterThan200(List<Wrestler> arrayLists) {
        return arrayLists.stream().filter(i->i.getWeight()>200).count();
    }
    public List<Wrestler> displayAllWrestlerNameInAscendingWhoseWeightIsGreaterThan150(List<Wrestler> arrayLists) {
        return arrayLists.stream().filter(i->i.getWeight()>150).sorted(Comparator.comparing(Wrestler::getName)).collect(Collectors.toList());
    }
    public List<Wrestler> displayAllTheWrestlerBasedOnHeightInDescendingOrder(List<Wrestler> arrayLists) {
        return arrayLists.stream().sorted(Comparator.comparingDouble(Wrestler::getHeight).reversed()).collect(Collectors.toList());
    }
}
