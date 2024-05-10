package org.example;

public class TestingK {
    private int id;
    public TestingK(int id){
        this.id=id;
    }
    public int getId(){
        return  id;
    }

    @Override
    public int hashCode(){
        return id;
    }
    @Override
    public boolean equals(Object anything){
        if(this == anything){
            return true;
        }
        if(this.getClass()!=anything.getClass()|| anything==null){
            return false;
        }
        TestingK key=(TestingK) anything;
        return id==key.getId();
    }
}
