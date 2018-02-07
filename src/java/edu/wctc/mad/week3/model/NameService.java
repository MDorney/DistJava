/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.mad.week3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author L117student
 */
public class NameService {
    
    private List<Name> nameList = Arrays.asList(new Name("1", "Fred", "Jones"), new Name("2", "Joe", "Smith"));
    
    public Name getName(String id){
        
        Name theName = null;
        for (Name name : nameList) {
            if (name.getId().equals(id)) {
                theName = name;
            }
        }
        return theName;
    }
    
    public List<Name> getAllNames(){
        return nameList;
    }
    
    public List<Name> findNames(String search) {
        List<Name> theList = new ArrayList<Name>();
        search = search.toLowerCase();
        for (Name name : nameList) {
            
            if (name.getFirst().toLowerCase().startsWith(search) || name.getLast().toLowerCase().startsWith(search)) {
                theList.add(name);
            }
        }
        return theList;
    }
}
